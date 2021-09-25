package pl.myprogression.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Provider;
import java.security.Security;

@SpringBootTest
class MyProgressionSecurityApplicationTests
{

    @Test
    void contextLoads()
    {
    }

    @Test
    void algorithm() {
        for (Provider provider : Security.getProviders()) {
            System.out.println("Provider: " + provider.getName());
            for (Provider.Service service : provider.getServices()) {
                System.out.println("  Algorithm: " + service.getAlgorithm());
            }
        }
    }

}
