package implementation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Company> companyList = List.of(
                new Company("ООО Крона", "7896652", "40008763"),
                new Company("ООО Маяк", "752246", "47258400"),
                new Company("Фирма", "444652", "36271024"),
                new Company("ООО Рисан", "82445599", "86314555")

        );
        List<Freelancer> freelancersList = List.of(
                new Freelancer("Ilya", "974216"),
                new Freelancer("Budulai", "2284769"),
                new Freelancer("Grisha", "44445555"),
                new Freelancer("Igorek", "05801111")

        );

        companyList.stream()
                .filter(company -> company.getShortName().equals("Фирма"))
               .forEach(System.out::println);

        System.out.println();

        freelancersList.stream()
                .filter(freelancer -> freelancer.getName().equals("Ilya"))
                .forEach(System.out::println);

        System.out.println();
       freelancersList.stream()
               .max(Comparator.comparing(Freelancer::getPayNumber))
               .ifPresent(System.out::println);

        System.out.println();
        
       companyList.stream()
               .sorted(Comparator.comparing(Company::getShortName)
                       .thenComparing(Company::getIndividualNumber))
               .collect(Collectors.toList())
               .forEach(System.out::println);




    }
}
