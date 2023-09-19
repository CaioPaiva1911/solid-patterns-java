package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
    //Interface Segregation Principle
    BigDecimal valor();
    LocalDate data();

}
