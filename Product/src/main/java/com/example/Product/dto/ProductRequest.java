package com.example.Product.dto;

import java.math.BigDecimal;

public record ProductRequest(String name, String description, BigDecimal price) {
}