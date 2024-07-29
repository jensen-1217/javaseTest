package genericity.demo5;

import java.util.*;

public class Doudizhu {
    public static void main(String[] args) {
        Map<Integer,String> pokerMap = new HashMap<>();
        List<Integer> pokerNumber =new ArrayList<>();
        String[] color={"❤","♠","♦","♣"};
        String[] number={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        int index=0;
        pokerMap.put(index,"大王");
        pokerNumber.add(index);
        index++;
        pokerMap.put(index,"小王");
        pokerNumber.add(index);
        index++;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < color.length; j++) {
                pokerMap.put(index,color[j]+number[i]);
                pokerNumber.add(index);
                index++;
            }
        }
        //System.out.println(pokerMap);
        Collections.shuffle(pokerNumber);
        //System.out.println(pokerNumber);

        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();

        for (int i = 0; i < pokerNumber.size(); i++) {
            if(i>50){
                dp.add(pokerNumber.get(i));
            }else if (i%3==0){
                player1.add(pokerNumber.get(i));
            }else if (i%3==1){
                player2.add(pokerNumber.get(i));
            }else if (i%3==2){
                player3.add(pokerNumber.get(i));
            }
        }
        /*System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dp);*/

        lookPoker("小乔",player1,pokerMap);
        lookPoker("大乔",player2,pokerMap);
        lookPoker("孙尚香",player3,pokerMap);
        lookPoker("底牌",dp,pokerMap);


    }
    public static void lookPoker(String name,TreeSet<Integer> treeSet,Map<Integer,String> pokerMap){
        System.out.println(name+"手中的扑克牌：");
        for (Integer pokerNum : treeSet) {
            String poker = pokerMap.get(pokerNum);
            System.out.print(poker+" ");
        }
        System.out.println();
    }


}
