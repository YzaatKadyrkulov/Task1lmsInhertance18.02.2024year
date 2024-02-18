
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
   /**
    * Deadline : 19.02.2024 / 17:00
    * БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.
    * ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ
    * КЫЛЫП  ТУЗОСУЗДОР.
    * АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.
    * АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА
    * МЕТОДТОРУ БАР СУРОТТОГУДОЙ.
    * КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
    * МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
    * КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.
    */

     Programmer programmer = new Programmer("Nursultan","JavaScript","Aizat","Java","PeaksoftHouse");

     Dancer dancer = new Dancer("Nursultant","JavaScript","Michael Jackson","Musician group","The Jackson 5");

     Singer singer = new Singer("Nursultan","JavaScript","Mirber Atabekov","singer","Kyrgyz group");

        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);
        }
    }
