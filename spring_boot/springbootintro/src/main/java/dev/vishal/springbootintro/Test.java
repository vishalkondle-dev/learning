package dev.vishal.springbootintro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Value("${port}")
    int port;

    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }
}
