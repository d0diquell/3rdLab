package com.company;

import java.util.Arrays;
import java.util.Scanner;

    public class Main {

        public static void main(String []args){
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Enter any text: ");
                String str = in.nextLine();

                System.out.print("Enter k: ");
                int k = in.nextInt();

                String textAfterRemoves = removeWords(str, k);
                System.out.print(textAfterRemoves);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        public static String removeWords(String text, int counter){
            StringBuilder newText = new StringBuilder();
            for (String line : text.split("\n")) {
                String[] words = line.split(" ");

                if (words.length <= counter) {
                    newText.append(" ");
                    break;
                }
                if (counter < 0){
                    newText.append("Error k < 0 ");
                    break;
                }

                String[] swap = Arrays.copyOfRange(words, counter, words.length);
                newText.append(String.join(" ", swap));
                newText.append("\n");
            }
            newText.deleteCharAt(newText.length()-1);
            return newText.toString();
        }

    }

