package com.internship.folder3.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String geGermanGreeting() {
        return "Hallo - Primärer Begrüßungsdienst";
    }
}