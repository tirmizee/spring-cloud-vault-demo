# spring-cloud-vault-demo

### main branch

```yaml
spring:
  application.name: spring-vault-kv
  config:
    import: vault://
  cloud:
    vault:
      uri: http://0.0.0.0:8200
      connection-timeout: 5000
      read-timeout: 15000
      authentication: TOKEN
      token: ${VAULT_TOKEN}
logging:
  level:
    org.springframework.cloud.vault: DEBUG

```

```java
@Bean
public ApplicationRunner applicationRunner(
    @Value("${username}") String username,
    @Value("${password}") String password
) {
    return args -> {
        System.out.println(username);
        System.out.println(password);
    };
}

```

### tag v2



### tag v3