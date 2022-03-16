import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Giriniz (1-12) : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz (1-31) : ");
        day = input.nextInt();

        // Switch-Case ile yapımı
       /* switch (month){
            case 1 :
                if (1 <= day && day <= 31){
                    if (day <= 21){
                        burc = "Oğlak";
                    }
                    else {
                        burc = "Kova";
                    }
                } else {
                  isError = true;
                }

                break;
            case 2 :
                if (1 <= day && day <= 28){
                    if (day <= 19){
                        burc = "Kova";
                    }
                    else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3 :
                if (1 <= day && day <= 31){
                    if (day <= 20){
                        burc = "Balık";
                    }
                    else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4 :
                if (1 <= day && day <= 30){
                    if (day <= 20){
                        burc = "Koç";
                    }
                    else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5 :
                if (1 <= day && day <= 31){
                    if (day <= 21){
                        burc = "Boğa";
                    }
                    else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6 :
                if (1 <= day && day <= 30){
                    if (day <= 22){
                        burc = "İkizler";
                    }
                    else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7 :
                if (1 <= day && day <= 31){
                    if (day <= 22){
                        burc = "Yengeç";
                    }
                    else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8 :
                if (1 <= day && day <= 31){
                    if (day <= 22){
                        burc = "Aslan";
                    }
                    else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9 :
                if (1 <= day && day <= 30){
                    if (day <= 22){
                        burc = "Başak";
                    }
                    else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10 :
                if (1 <= day && day <= 31){
                    if (day <= 22){
                        burc = "Terazi";
                    }
                    else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11 :
                if (1 <= day && day <= 30){
                    if (day <= 21){
                        burc = "Akrep";
                    }
                    else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12 :
                if (1 <= day && day <= 31){
                    if (day <= 21){
                        burc = "Yay";
                    }
                    else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError){
            System.out.println("Hatalı Sayı Girdiniz !");
        }
        else {
            System.out.println("Merhaba, Burcunuz : " + burc);
        }

        */

        // if-else ile yapımı
        if (month == 1) {
            if (1 <= day && day <= 31){
                if (day <= 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 2) {
            if (1 <= day && day <= 28){
                if (day <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 3) {
            if (1 <= day && day <= 31){
                if (day <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 4) {
            if (1 <= day && day <= 30){
                if (day <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        }
        else if(month == 5) {
            if (1 <= day && day <= 31){
                if (day <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 6) {
            if (1 <= day && day <= 30){
                if (day <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 7) {
            if (1 <= day && day <= 31){
                if (day <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 8) {
            if (1 <= day && day <= 31){
                if (day <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 9) {
            if (1 <= day && day <= 30){
                if (day <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 10) {
            if (1 <= day && day <= 31){
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 11) {
            if (1 <= day && day <= 30){
                if (day <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        }
        else if (month == 12) {
            if (1 <= day && day <= 31){
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        }
        else {
            isError = true;
        }

        if (isError){
            System.out.println("Hatalı Sayı Girdiniz !");
        }
        else {
            System.out.println("Merhaba, Burcunuz : " + burc);
        }
    }
}
