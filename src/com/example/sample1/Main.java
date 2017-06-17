package com.example;

/**
 * @author daicham
 */
@SuppressWarnings("ALL")
public class Main {
    public static void main(String... args) {

        型パラメータを単純に指定した場合のメソッド呼び出し();
        型パラメータをextendsにした場合のメソッド呼び出し();
        型パラメータをsuperにした場合のメソッド呼び出し();
        型パラメータを単純に指定した場合の代入();
        型パラメータがextendsの場合の代入();
        型パラメータがsuperの場合の代入();

    }

    private static void 型パラメータを単純に指定した場合のメソッド呼び出し() {
        Holder<Ticket> ticketHolder = new DefaultHolder<>();
        ticketHolder.set(new MuseumTicket()); // OK : 型パラメータのサブクラスなのでOK
        ticketHolder.set(new SportsTicket()); // OK : 型パラメータのサブクラスなのでOK
        Ticket ticket = ticketHolder.get(); // OK : 型パラメータのクラスなのでOK
//        SportsTicket sportsTicket = ticketHolder.get(); // 型パラメータのサブクラスに限定できないのでNG
    }

    private static void 型パラメータをextendsにした場合のメソッド呼び出し() {
        Holder<? extends Ticket> ticketHolder = new DefaultHolder<>();
//        ticketHolder.set(new MuseumTicket()); // NG : 型パラメータのサブクラスだが extends 且つ引数なのでNG
//        ticketHolder.set(new SportsTicket()); // NG : 型パラメータのサブクラスだが extends 且つ引数なのでNG
        Ticket ticket = ticketHolder.get();  // OK : 型パラメータのクラスなのでOK
//        SportsTicket sportsTicket = ticketHolder.get(); // 型パラメータのサブクラスに限定できないのでNG
    }

    private static void 型パラメータをsuperにした場合のメソッド呼び出し() {
        Holder<? super Ticket> ticketHolder = new DefaultHolder<>();
        ticketHolder.set(new MuseumTicket()); // OK : 型パラメータのサブクラスで super なので引数はOK
        ticketHolder.set(new SportsTicket()); // OK : 型パラメータのサブクラスで super なので引数はOK
//        Ticket ticket = ticketHolder.get();  // NG : 型パラメータが super 且つ戻り値なのでNG
        Object object = ticketHolder.get();  // OK : ただし Object はOK
    }

    private static void 型パラメータを単純に指定した場合の代入() {
        Holder<Ticket> ticketHolder = new DefaultHolder<>();
        Holder<SportsTicket> sportsTicketHolder = new DefaultHolder<>();
//        ticketHolder = sportsTicketHolder; // NG : 型パラメータが継承関係にあっても単純指定の場合はNG
    }

    private static void 型パラメータがextendsの場合の代入() {
        Holder<? extends Ticket> ticketHolder;
        Holder<SportsTicket> sportsTicketHolder = new DefaultHolder<>();
        ticketHolder = sportsTicketHolder; // OK : 型パラメータのサブクラスであればOK
    }

    private static void 型パラメータがsuperの場合の代入() {
        Holder<? super Ticket> ticketHolder;
        Holder<SportsTicket> sportsTicketHolder = new DefaultHolder<>();
//        ticketHolder = sportsTicketHolder; // NG : 型パラメータのサブクラスであってもNG
    }

}
