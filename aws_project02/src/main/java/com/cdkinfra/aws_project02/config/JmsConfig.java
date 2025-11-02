package com.cdkinfra.aws_project02.config;

import javax.jms.ConnectionFactory;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.destination.DynamicDestinationResolver;

import com.amazon.sqs.javamessaging.ProviderConfiguration;
import com.amazon.sqs.javamessaging.SQSConnectionFactory;

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;

@Configuration
public class JmsConfig {

  @Value("${aws.region}")
  private String awsRegion;

  @Bean
  SqsClient sqsClient() {
    return SqsClient.builder() //
        .region(Region.of(awsRegion))
        .credentialsProvider(DefaultCredentialsProvider.create())
        .build();
  }

  @Bean
  ConnectionFactory sqsConnectionFactory(SqsClient sqsClient) {
    return new SQSConnectionFactory(
        new ProviderConfiguration(),
        sqsClient);
  }

  @Bean
  DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
    DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
    factory.setConnectionFactory((jakarta.jms.ConnectionFactory) connectionFactory);
    factory.setConcurrency("3");
    factory.setDestinationResolver(new DynamicDestinationResolver());
    factory.setSessionAcknowledgeMode(Session.CLIENT_ACKNOWLEDGE);

    return factory;
  }

}
