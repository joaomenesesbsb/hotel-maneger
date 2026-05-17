package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Embeddable
public class MoneyEmbeddable {

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    public MoneyEmbeddable(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
