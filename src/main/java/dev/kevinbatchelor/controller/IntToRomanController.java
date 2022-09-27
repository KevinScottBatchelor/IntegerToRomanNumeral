package dev.kevinbatchelor.controller;

import dev.kevinbatchelor.exception.InvalidIntegerException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class IntToRomanController {

    @RequestMapping(path = "/conversion{integer}")
    public String getRomanNumeralFromInteger(@RequestParam int integer) {

        String result = "";

        if (integer < 0) throw new InvalidIntegerException();

        if (integer == 0) return "You entered " + integer +
                " which is nulla (The term for zero used by the Romans!)";

        if (integer >= 4000) throw new InvalidIntegerException();

        if (integer > 0 && integer < 4000) {

            String[] M = {"", "M", "MM", "MMM"};
            String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            result = M[integer / 1000] + C[(integer % 1000) / 100] + X[(integer % 100) / 10] + I[integer % 10];
        }

        return "You entered " + integer + ", which is expressed as the roman numeral: " + result;

    }
}
