package co.com.bussinesLogic;

import co.com.beans.Cliente;
import co.com.beans.Staff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> beta = Arrays.asList("WiLly","JavIEr","HAmilTOn");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        List<String> betaUpper = new ArrayList<>();

        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }
        for (String s : beta) {
            betaUpper.add(s.toUpperCase());
        }
        for (String d : beta) {
            betaUpper.add(d.toLowerCase());
        }

        System.out.println("Sin formato");
        System.out.println(alpha); //[a, b, c, d]
        System.out.println("Antes Java 8");
        System.out.println(alphaUpper); //[A, B, C, D]
        System.out.println(beta);
        System.out.println(betaUpper);

        // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect
                (Collectors.toList());
        System.out.println("Despues Java 8");
        System.out.println(collect); //[A, B, C, D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream().map(a -> a + 5).collect(Collectors.toList());
        System.out.println(num);
        System.out.println(collect1); //[2, 4, 6, 8, 10]

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30,10000),
                new Staff("jack", 27, 20000),
                new Staff("lawrence", 33,3000)
        );

        //Before Java 8
        List<String> result = new ArrayList<>();
        for (Staff x : staff) {
            result.add(x.getName());
        }
        System.out.println(result); //[mkyong, jack, lawrence]

        //Java 8
        List<String> collecting = staff.stream().map(Staff::getName)
                .collect(Collectors.toList()); //Staff::getName
        System.out.println(collecting); //[mkyong, jack, lawrence]




    }
}
