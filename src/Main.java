import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();
        if (day < 0 || day >= 31) {
            System.out.println("Girdiğiniz gün 1-31 arasında olmalıdır.");
        }

        //switchCaseOrnek(month, day);
        if (month < 1 || month > 13) {
            System.out.println("Girilen ay 1 - 12 aralıgında olmalıdır.");
        } else if (month == 1) {
            if (day >= 1 && day <= 21) {
                System.out.println("Burcunuz Oğlaktır.");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Burcunuz Kovadır.");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 20) {
                System.out.println("Burcunuz Kovadır.");
            } else if (day > 20 && day <= 29) {
                System.out.println("Burcunuz Balıktır.");
            }
        }
        else if (month == 3) {
            if (day >= 1 && day <= 20) {
                System.out.println("Burcunuz Balıktır.");
            } else if (day > 20 && day <= 31) {
                System.out.println("Burcunuz Koçtur.");
            }
        }
        else if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.println("Burcunuz Koçtur.");
            } else if (day > 20 && day <= 31) {
                System.out.println("Burcunuz Boğa.");
            }
        }
        else if (month == 5) {
            if (day >= 1 && day <= 21) {
                System.out.println("Burcunuz Boğa.");
            } else if (day > 21 && day <= 31) {
                System.out.println("Burcunuz İkizlerdir.");
            }
        }
        else if (month == 6) {
            if (day >= 1 && day <= 23) {
                System.out.println("Burcunuz İkizler.");
            } else if (day > 23 && day <= 31) {
                System.out.println("Burcunuz Yengeç.");
            }
        }


    }

    private static void switchCaseOrnek(int month, int day) {
        switch (month) {
            case 1:
                if (day >= 1 && day < 22) {
                    System.out.println("Burcunuz Oğlaktır.");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Burcunuz Kovadır.");
                }
                break;
            case 2:
                if (day >= 1 && day <= 19) {
                    System.out.println("Burcunuz Kovadır.");
                } else if (day > 19 && day <= 29) {
                    System.out.println("Burcunuz Balıktır.");
                } else {
                    System.out.println("Yanlış gün girildi.");
                }
            case 3:
                if (day >= 1 && day <= 20) {
                    System.out.println("Burcunuz balıktır.");
                } else if (day > 20 && day <= 31) {
                    System.out.println("Burcunuz Koçtur.");
                }
                break;
            case 4:
                if (day >= 1 && day <= 20) {
                    System.out.println("Burcunuz koçtur.");
                } else if (day >= 21 && day <= 31) {
                    System.out.println("Burcunuz Boğadır.");
                }
                break;
            case 5:
                if (day >= 1 && day <= 21) {
                    System.out.println("Burcunuz Boğadır.");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Burcunuz İkizlerdir.");
                }
                break;
            case 6:
                if (day >= 1 && day <= 22) {
                    System.out.println("Burcunuz İkizlerdir.");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Burcunuz Yengeçtir.");
                }
                break;
            case 7:
                if (day >= 1 && day <= 22) {
                    System.out.println("Burcunuz Yengeçtir.");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Burcunuz Aslandır.");
                }
                break;
            case 8:
                if (day >= 1 && day <= 22) {
                    System.out.println("Burcunuz Aslan.");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Burcunuz Başak.");
                }
                break;
            case 9:
                if (day >= 1 && day <= 22) {
                    System.out.println("Burcunuz Başaktır.");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Burcunuz Terazi.");
                }
                break;
            case 10:
                if (day >= 1 && day <= 22) {
                    System.out.println("Burcunuz Terazi.");
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Burcunuz Akrep.");
                }
                break;
            case 11:
                if (day >= 1 && day <= 21) {
                    System.out.println("Burcunuz Akrep.");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Burcunuz Yay.");
                }
                break;
            case 12:
                if (day >= 1 && day <= 21) {
                    System.out.println("Burcunuz Yay.");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Burcunuz Oğlak.");
                }
                break;
            default:
                System.out.println("Yanlış ay girdiniz!!!");
                break;
        }
    }
}
