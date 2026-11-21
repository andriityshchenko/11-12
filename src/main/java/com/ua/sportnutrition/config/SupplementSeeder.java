package com.ua.sportnutrition.config;

import com.ua.sportnutrition.domain.Supplement;
import com.ua.sportnutrition.repository.SupplementRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SupplementSeeder implements ApplicationRunner {

    private final SupplementRepository repository;

    public SupplementSeeder(SupplementRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Supplement(null,
                "100% Whey Gold Standard",
                "Optimum Nutrition",
                new BigDecimal("1850.00"),
                2270,
                "/images/whey-gold.jpg",
                "Преміальний сироватковий протеїн із високим вмістом BCAA. "
                        + "24 г білка на порцію, швидке засвоєння після тренування.",
                "Протеїн",
                "Подвійний шоколад"));

        repository.save(new Supplement(null,
                "Creatine Monohydrate",
                "Universal Nutrition",
                new BigDecimal("620.00"),
                500,
                "/images/creatine-universal.jpg",
                "Мікронізований креатин моногідрат для збільшення сили та витривалості. "
                        + "5 г на порцію, 100 порцій у банці.",
                "Креатин",
                "Без смаку"));

        repository.save(new Supplement(null,
                "BCAA 2:1:1",
                "MyProtein",
                new BigDecimal("780.00"),
                500,
                "/images/bcaa-myprotein.jpg",
                "Амінокислоти з розгалуженим ланцюгом у співвідношенні 2:1:1 (лейцин, "
                        + "ізолейцин, валін). Підтримують відновлення м'язів після навантажень.",
                "Амінокислоти",
                "Тропічний мікс"));

        repository.save(new Supplement(null,
                "Pre-Workout C4 Original",
                "Cellucor",
                new BigDecimal("1120.00"),
                390,
                "/images/c4-original.jpg",
                "Передтренувальний комплекс із бета-аланіном, кофеїном та креатином. "
                        + "Підвищує енергію та фокус під час тренування.",
                "Передтренувальник",
                "Вишневий лимонад"));

        repository.save(new Supplement(null,
                "Omega-3 Fish Oil",
                "NOW Foods",
                new BigDecimal("450.00"),
                200,
                "/images/omega3-now.jpg",
                "Риб'ячий жир із високою концентрацією EPA та DHA. "
                        + "Підтримує серцево-судинну систему та здоров'я суглобів. 200 капсул.",
                "Вітаміни та мінерали",
                "Без смаку"));
    }
}
