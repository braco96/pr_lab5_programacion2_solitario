/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the "entrega system".
 *
 */

package cartas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;

import aed.lifo.*;
import aed.fifo.*;

public class Tester {

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean ok_sofar = true;

    if (ok_sofar) ok_sofar = test_1();
    if (ok_sofar) ok_sofar = test_2();
    if (ok_sofar) ok_sofar = test_3();
    if (ok_sofar) ok_sofar = test_4();
    if (ok_sofar) ok_sofar = test_5();
    if (ok_sofar) ok_sofar = test_6();
    if (ok_sofar) ok_sofar = test_7();
    if (ok_sofar) ok_sofar = test_8();
    if (ok_sofar) ok_sofar = test_9();
    if (ok_sofar) ok_sofar = test_10();
    if (ok_sofar) ok_sofar = test_11();
    if (ok_sofar) ok_sofar = test_12();
    if (ok_sofar) ok_sofar = test_13();
    if (ok_sofar) ok_sofar = test_14();
    if (ok_sofar) ok_sofar = test_15();
    if (ok_sofar) ok_sofar = test_16();
    if (ok_sofar) ok_sofar = test_17();
    if (ok_sofar) ok_sofar = test_18();
    if (ok_sofar) ok_sofar = test_19();
    if (ok_sofar) ok_sofar = test_20();
    if (ok_sofar) ok_sofar = test_21();
    if (ok_sofar) ok_sofar = test_22();

    if (ok_sofar)
      System.out.println("\n Tester: Test finalizado correctamente.");
  }




  static boolean test_1() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.pica(2),Carta.pica(5),Carta.trebol(2),Carta.trebol(10),Carta.pica(10),Carta.pica(6),Carta.trebol(6),Carta.corazon(2),Carta.diamante(2),Carta.trebol(7),Carta.diamante(10),Carta.corazon(1),Carta.diamante(1),Carta.corazon(4),Carta.corazon(10),Carta.trebol(4),Carta.diamante(7),Carta.pica(4),Carta.diamante(8),Carta.corazon(8),Carta.corazon(9),Carta.pica(1),Carta.pica(3),Carta.pica(9),Carta.pica(8),Carta.diamante(6),Carta.corazon(5),Carta.trebol(8),Carta.diamante(5),Carta.diamante(4),Carta.trebol(3),Carta.diamante(9),Carta.diamante(3),Carta.pica(7),Carta.trebol(9),Carta.corazon(3),Carta.trebol(5),Carta.corazon(7),Carta.trebol(1),Carta.corazon(6) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6),Carta.pica(7),Carta.pica(8),Carta.pica(9),Carta.pica(10) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6),Carta.corazon(7),Carta.corazon(8),Carta.corazon(9),Carta.corazon(10) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6),Carta.diamante(7),Carta.diamante(8),Carta.diamante(9),Carta.diamante(10) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8),Carta.trebol(9),Carta.trebol(10) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(1)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.corazon(6))},
        {Move.mazo(Carta.pica(5)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(2)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.pica(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(6))},
        {Move.monton(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.pica(3)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(7))},
        {Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(7))},
        {Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.pica(4)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(6))},
        {Move.monton(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.corazon(7))},
        {Move.mazo(Carta.pica(10)),Move.monton(Carta.pica(6)),Move.mazo(Carta.trebol(6)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.pica(7)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.corazon(7))},
        {Move.mazo(Carta.pica(10)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(9)),Move.monton(Carta.pica(8)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(6))},
        {Move.mazo(Carta.pica(10)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(6))},
        {Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(6))},
        {Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.diamante(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.trebol(9)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.corazon(6))},
        {Move.monton(Carta.trebol(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.diamante(8)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(7))},
        {Move.monton(Carta.pica(10)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(9))},
        {Move.mazo(Carta.corazon(10)),Move.monton(Carta.corazon(8)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.diamante(9))},
        {Move.monton(Carta.diamante(10)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.corazon(9))},
        {Move.monton(Carta.corazon(10))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_1");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_1",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_1",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_1",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_1",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_1",590);

    return ok_sofar;
  }


  static boolean test_2() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.trebol(5),Carta.diamante(10),Carta.pica(8),Carta.trebol(8),Carta.corazon(1),Carta.corazon(4),Carta.pica(10),Carta.corazon(3),Carta.diamante(1),Carta.pica(2),Carta.diamante(9),Carta.corazon(6),Carta.trebol(7),Carta.trebol(10),Carta.trebol(4),Carta.corazon(5),Carta.diamante(2),Carta.corazon(2),Carta.trebol(2),Carta.pica(7),Carta.corazon(7),Carta.diamante(7),Carta.pica(4),Carta.trebol(3),Carta.pica(1),Carta.diamante(4),Carta.diamante(8),Carta.corazon(8),Carta.pica(5),Carta.diamante(6),Carta.diamante(5),Carta.corazon(10),Carta.trebol(6),Carta.pica(9),Carta.trebol(9),Carta.diamante(3),Carta.trebol(1),Carta.pica(3),Carta.corazon(9),Carta.pica(6) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6),Carta.pica(7),Carta.pica(8),Carta.pica(9),Carta.pica(10) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6),Carta.corazon(7),Carta.corazon(8),Carta.corazon(9),Carta.corazon(10) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6),Carta.diamante(7),Carta.diamante(8),Carta.diamante(9),Carta.diamante(10) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8),Carta.trebol(9),Carta.trebol(10) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(3)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(3)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(6))},
        {Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(9))},
        {Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(10)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(6))},
        {Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.pica(10)),Move.monton(Carta.pica(2)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(4)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(3)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.pica(3)),Move.mazo(Carta.corazon(9))},
        {Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(6)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(4)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.pica(6))},
        {Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.pica(7)),Move.monton(Carta.corazon(7)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.pica(4)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.corazon(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.corazon(9)),Move.mazo(Carta.pica(6))},
        {Move.monton(Carta.trebol(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.corazon(10)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(9))},
        {Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.pica(5)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.pica(6))},
        {Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(9))},
        {Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(7)),Move.monton(Carta.diamante(7)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.pica(9))},
        {Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(7)),Move.monton(Carta.diamante(8)),Move.mazo(Carta.pica(9))},
        {Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10)),Move.monton(Carta.diamante(9)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(9))},
        {Move.monton(Carta.diamante(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.pica(7)),Move.mazo(Carta.pica(9))},
        {Move.monton(Carta.pica(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.pica(9)),Move.mazo(Carta.trebol(9))},
        {Move.monton(Carta.trebol(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(9))},
        {Move.monton(Carta.pica(10)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.trebol(9))},
        {Move.monton(Carta.trebol(10))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_2");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_2",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_2",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_2",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_2",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_2",554);

    return ok_sofar;
  }


  static boolean test_3() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.corazon(8),Carta.trebol(5),Carta.trebol(1),Carta.diamante(6),Carta.pica(5),Carta.diamante(7),Carta.trebol(10),Carta.diamante(3),Carta.trebol(6),Carta.pica(8),Carta.corazon(2),Carta.trebol(4),Carta.diamante(4),Carta.corazon(7),Carta.corazon(1),Carta.corazon(3),Carta.trebol(8),Carta.pica(9),Carta.diamante(2),Carta.corazon(6),Carta.pica(3),Carta.diamante(10),Carta.pica(1),Carta.pica(10),Carta.corazon(5),Carta.trebol(3),Carta.diamante(1),Carta.trebol(7),Carta.corazon(4),Carta.pica(2),Carta.pica(7),Carta.trebol(9),Carta.diamante(5),Carta.corazon(10),Carta.diamante(8),Carta.trebol(2),Carta.pica(4),Carta.corazon(9),Carta.pica(6),Carta.diamante(9) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6),Carta.pica(7),Carta.pica(8),Carta.pica(9),Carta.pica(10) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6),Carta.corazon(7),Carta.corazon(8),Carta.corazon(9),Carta.corazon(10) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6),Carta.diamante(7),Carta.diamante(8),Carta.diamante(9),Carta.diamante(10) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.trebol(5)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.pica(1)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(3)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.diamante(9))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.pica(9)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.diamante(9))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.corazon(4)),Move.monton(Carta.pica(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(6))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(8)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.trebol(4)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(6)),Move.monton(Carta.pica(3)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.pica(4)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.diamante(9))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(8)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(6))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(10)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.diamante(9))},
        {Move.mazo(Carta.trebol(5)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.pica(5)),Move.monton(Carta.diamante(7)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.diamante(8)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.diamante(9))},
        {Move.mazo(Carta.trebol(5)),Move.monton(Carta.pica(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(6)),Move.monton(Carta.diamante(9))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(9)),Move.monton(Carta.corazon(6)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.pica(6))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(9)),Move.monton(Carta.diamante(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(10))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.pica(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(9))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(6)),Move.monton(Carta.pica(8)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(10))},
        {Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(6)),Move.monton(Carta.corazon(7)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.pica(9)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(9))},
        {Move.monton(Carta.corazon(8)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(9))},
        {Move.monton(Carta.trebol(5)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.pica(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.corazon(9))},
        {Move.mazo(Carta.trebol(8)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.corazon(10))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_3");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_3",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_3",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_3",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_3",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_3",625);

    return ok_sofar;
  }


  static boolean test_4() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.pica(1),Carta.corazon(10),Carta.diamante(4),Carta.corazon(5),Carta.pica(6),Carta.pica(7),Carta.diamante(1),Carta.pica(8),Carta.trebol(3),Carta.corazon(7),Carta.trebol(7),Carta.pica(5),Carta.corazon(2),Carta.diamante(7),Carta.diamante(6),Carta.diamante(5),Carta.diamante(8),Carta.diamante(2),Carta.diamante(10),Carta.trebol(1),Carta.corazon(1),Carta.trebol(5),Carta.trebol(4),Carta.corazon(4),Carta.trebol(8),Carta.pica(10),Carta.corazon(8),Carta.pica(9),Carta.diamante(9),Carta.pica(3),Carta.trebol(2),Carta.diamante(3),Carta.corazon(6),Carta.corazon(3),Carta.pica(4),Carta.trebol(10),Carta.trebol(9),Carta.pica(2),Carta.corazon(9),Carta.trebol(6) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6),Carta.pica(7),Carta.pica(8),Carta.pica(9),Carta.pica(10) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6),Carta.corazon(7),Carta.corazon(8),Carta.corazon(9),Carta.corazon(10) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8),Carta.trebol(9),Carta.trebol(10) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.monton(Carta.pica(1)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(7)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(1)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(6))},
        {Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.corazon(6)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.pica(2)),Move.mazo(Carta.corazon(9))},
        {Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(3)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(6))},
        {Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(3)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(9))},
        {Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(6))},
        {Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.monton(Carta.pica(4)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.trebol(6))},
        {Move.mazo(Carta.diamante(4)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.pica(5)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.trebol(9))},
        {Move.mazo(Carta.diamante(4)),Move.monton(Carta.pica(6)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.trebol(9))},
        {Move.mazo(Carta.diamante(4)),Move.monton(Carta.pica(7)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(6)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.trebol(9)),Move.mazo(Carta.corazon(9))},
        {Move.mazo(Carta.diamante(4)),Move.monton(Carta.pica(8)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(10))},
        {Move.mazo(Carta.diamante(4)),Move.monton(Carta.corazon(7)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.pica(9)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.trebol(10)),Move.mazo(Carta.corazon(9))},
        {Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(10)),Move.monton(Carta.corazon(8)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(9))},
        {Move.monton(Carta.corazon(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(10))},
        {Move.monton(Carta.diamante(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.pica(10)),Move.mazo(Carta.diamante(9))},
        {Move.mazo(Carta.diamante(6)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(9))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_4");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_4",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_4",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_4",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_4",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_4",619);

    return ok_sofar;
  }


  static boolean test_5() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.diamante(6),Carta.pica(4),Carta.corazon(6),Carta.pica(9),Carta.trebol(10),Carta.trebol(4),Carta.trebol(2),Carta.diamante(9),Carta.corazon(7),Carta.corazon(2),Carta.pica(5),Carta.diamante(10),Carta.pica(1),Carta.pica(3),Carta.pica(7),Carta.pica(6),Carta.diamante(3),Carta.corazon(8),Carta.pica(10),Carta.trebol(7),Carta.pica(8),Carta.pica(2),Carta.corazon(5),Carta.trebol(9),Carta.diamante(5),Carta.diamante(4),Carta.diamante(7),Carta.diamante(2),Carta.diamante(1),Carta.trebol(3),Carta.corazon(1),Carta.trebol(6),Carta.trebol(5),Carta.corazon(3),Carta.corazon(9),Carta.trebol(1),Carta.diamante(8),Carta.trebol(8),Carta.corazon(10),Carta.corazon(4) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6),Carta.pica(7),Carta.pica(8),Carta.pica(9) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6),Carta.corazon(7),Carta.corazon(8),Carta.corazon(9),Carta.corazon(10) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6),Carta.diamante(7),Carta.diamante(8),Carta.diamante(9),Carta.diamante(10) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.pica(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(2)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.trebol(3)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(8)),Move.monton(Carta.pica(2)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(10))},
        {Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(4)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.pica(3)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(6)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.corazon(4))},
        {Move.monton(Carta.diamante(6)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(8)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.diamante(7)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.diamante(8)),Move.mazo(Carta.trebol(8))},
        {Move.monton(Carta.pica(4)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(8))},
        {Move.monton(Carta.corazon(6)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(8))},
        {Move.mazo(Carta.trebol(10)),Move.monton(Carta.diamante(9)),Move.mazo(Carta.pica(5)),Move.monton(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(8))},
        {Move.mazo(Carta.trebol(10)),Move.monton(Carta.pica(5)),Move.mazo(Carta.pica(7)),Move.monton(Carta.pica(6)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(8))},
        {Move.mazo(Carta.trebol(10)),Move.monton(Carta.pica(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.pica(8)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(8))},
        {Move.monton(Carta.pica(9)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.corazon(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.corazon(10))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_5");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_5",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_5",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_5",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_5",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_5",623);

    return ok_sofar;
  }


  static boolean test_6() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.trebol(5),Carta.corazon(2),Carta.corazon(4),Carta.pica(7),Carta.trebol(3),Carta.diamante(3),Carta.corazon(8),Carta.pica(3),Carta.diamante(6),Carta.diamante(2),Carta.corazon(1),Carta.trebol(7),Carta.trebol(8),Carta.trebol(1),Carta.diamante(5),Carta.pica(5),Carta.corazon(9),Carta.corazon(7),Carta.corazon(5),Carta.corazon(6),Carta.diamante(10),Carta.pica(1),Carta.diamante(4),Carta.pica(10),Carta.diamante(9),Carta.corazon(10),Carta.corazon(3),Carta.trebol(2),Carta.trebol(6),Carta.trebol(9),Carta.diamante(8),Carta.pica(4),Carta.diamante(1),Carta.pica(8),Carta.pica(2),Carta.diamante(7),Carta.pica(9),Carta.trebol(4),Carta.pica(6),Carta.trebol(10) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6),Carta.pica(7),Carta.pica(8) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6),Carta.diamante(7),Carta.diamante(8),Carta.diamante(9),Carta.diamante(10) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(2)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.pica(4)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(10))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(8)),Move.monton(Carta.pica(2)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(10))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(7)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(10))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.pica(3)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.pica(4)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(9)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.pica(6))},
        {Move.monton(Carta.trebol(5)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(7)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.pica(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6))},
        {Move.monton(Carta.corazon(2)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6))},
        {Move.monton(Carta.corazon(4)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6))},
        {Move.mazo(Carta.corazon(8)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6))},
        {Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.pica(8)),Move.monton(Carta.diamante(7)),Move.mazo(Carta.pica(9)),Move.monton(Carta.pica(6)),Move.mazo(Carta.trebol(10))},
        {Move.monton(Carta.pica(7)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.corazon(6)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.diamante(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(10))},
        {Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(10)),Move.monton(Carta.diamante(9)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(10))},
        {Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.diamante(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.pica(8)),Move.mazo(Carta.pica(9))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_6");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_6",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_6",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_6",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_6",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_6",591);

    return ok_sofar;
  }


  static boolean test_7() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.corazon(5),Carta.pica(9),Carta.diamante(5),Carta.trebol(9),Carta.trebol(6),Carta.diamante(10),Carta.corazon(10),Carta.pica(1),Carta.trebol(2),Carta.pica(3),Carta.pica(7),Carta.pica(2),Carta.trebol(7),Carta.pica(5),Carta.corazon(7),Carta.diamante(6),Carta.corazon(9),Carta.diamante(2),Carta.corazon(8),Carta.trebol(8),Carta.corazon(6),Carta.pica(4),Carta.corazon(1),Carta.diamante(3),Carta.trebol(4),Carta.trebol(3),Carta.trebol(5),Carta.trebol(1),Carta.diamante(4),Carta.diamante(1),Carta.corazon(4),Carta.pica(6),Carta.corazon(3),Carta.diamante(8),Carta.trebol(10),Carta.diamante(7),Carta.diamante(9),Carta.corazon(2),Carta.pica(8),Carta.pica(10) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6),Carta.diamante(7),Carta.diamante(8),Carta.diamante(9),Carta.diamante(10) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(4)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.pica(8))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(1)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(4)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(3)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(4)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(4)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.diamante(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.pica(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(6)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(7)),Move.monton(Carta.pica(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.pica(3)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(4)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.pica(6)),Move.monton(Carta.diamante(8)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.diamante(9)),Move.mazo(Carta.pica(8))},
        {Move.monton(Carta.corazon(5)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(6)),Move.monton(Carta.diamante(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(6)),Move.monton(Carta.pica(4)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8))},
        {Move.mazo(Carta.trebol(9)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.pica(5)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(6)),Move.monton(Carta.pica(6)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.trebol(9)),Move.mazo(Carta.pica(7)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(8))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_7");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_7",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_7",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_7",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_7",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_7",657);

    return ok_sofar;
  }


  static boolean test_8() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.trebol(6),Carta.corazon(3),Carta.trebol(7),Carta.corazon(2),Carta.trebol(9),Carta.pica(4),Carta.pica(5),Carta.pica(10),Carta.trebol(8),Carta.pica(7),Carta.diamante(2),Carta.corazon(9),Carta.trebol(1),Carta.corazon(7),Carta.corazon(8),Carta.diamante(10),Carta.diamante(8),Carta.diamante(6),Carta.corazon(5),Carta.pica(3),Carta.trebol(10),Carta.corazon(6),Carta.corazon(10),Carta.pica(6),Carta.pica(2),Carta.trebol(4),Carta.pica(9),Carta.pica(8),Carta.diamante(5),Carta.pica(1),Carta.diamante(4),Carta.diamante(1),Carta.diamante(9),Carta.diamante(7),Carta.trebol(5),Carta.corazon(1),Carta.corazon(4),Carta.trebol(3),Carta.diamante(3),Carta.trebol(2) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6),Carta.diamante(7),Carta.diamante(8),Carta.diamante(9),Carta.diamante(10) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8),Carta.trebol(9),Carta.trebol(10) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.trebol(2))},
        {Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(3)),Move.monton(Carta.trebol(2))},
        {Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(3)),Move.monton(Carta.diamante(3))},
        {Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(6)),Move.monton(Carta.pica(2)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(4)),Move.monton(Carta.trebol(3))},
        {Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(6)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(5))},
        {Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(5))},
        {Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.corazon(4))},
        {Move.monton(Carta.trebol(6)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(7))},
        {Move.mazo(Carta.corazon(2)),Move.monton(Carta.trebol(9)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.pica(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.diamante(7)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.corazon(2)),Move.monton(Carta.pica(4)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.diamante(8)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.trebol(10)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(8)),Move.monton(Carta.diamante(9)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.corazon(2)),Move.monton(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.diamante(10)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.pica(6)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(4))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_8");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_8",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_8",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_8",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_8",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_8",643);

    return ok_sofar;
  }


  static boolean test_9() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.corazon(9),Carta.corazon(2),Carta.trebol(3),Carta.trebol(7),Carta.pica(4),Carta.corazon(10),Carta.pica(9),Carta.trebol(5),Carta.pica(2),Carta.trebol(10),Carta.trebol(6),Carta.trebol(8),Carta.pica(6),Carta.diamante(2),Carta.diamante(5),Carta.diamante(10),Carta.corazon(1),Carta.corazon(8),Carta.pica(7),Carta.pica(8),Carta.diamante(8),Carta.diamante(1),Carta.pica(5),Carta.corazon(5),Carta.diamante(3),Carta.trebol(2),Carta.pica(10),Carta.pica(1),Carta.pica(3),Carta.diamante(6),Carta.trebol(1),Carta.corazon(6),Carta.corazon(7),Carta.corazon(3),Carta.trebol(9),Carta.diamante(9),Carta.diamante(7),Carta.diamante(4),Carta.corazon(4),Carta.trebol(4) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6),Carta.pica(7),Carta.pica(8) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8),Carta.trebol(9),Carta.trebol(10) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.trebol(4))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(3)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.pica(10)),Move.monton(Carta.pica(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.trebol(4))},
        {Move.mazo(Carta.corazon(2)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.pica(2)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(10)),Move.monton(Carta.pica(3)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(4)),Move.monton(Carta.trebol(4))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(4))},
        {Move.mazo(Carta.corazon(2)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(4))},
        {Move.mazo(Carta.corazon(2)),Move.monton(Carta.pica(4)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.pica(6)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.pica(5)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.trebol(9)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(4))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(9)),Move.monton(Carta.trebol(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(9)),Move.monton(Carta.pica(6)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.pica(7)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(9)),Move.monton(Carta.diamante(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(4))},
        {Move.mazo(Carta.corazon(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.pica(8)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(10)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(7))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_9");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_9",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_9",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_9",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_9",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_9",611);

    return ok_sofar;
  }


  static boolean test_10() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.diamante(5),Carta.corazon(10),Carta.pica(3),Carta.diamante(8),Carta.trebol(5),Carta.trebol(10),Carta.corazon(8),Carta.pica(2),Carta.pica(5),Carta.pica(9),Carta.diamante(3),Carta.corazon(9),Carta.diamante(10),Carta.pica(10),Carta.diamante(4),Carta.corazon(7),Carta.corazon(3),Carta.pica(1),Carta.diamante(6),Carta.corazon(2),Carta.trebol(2),Carta.diamante(7),Carta.diamante(2),Carta.pica(6),Carta.trebol(3),Carta.corazon(4),Carta.corazon(5),Carta.diamante(1),Carta.corazon(1),Carta.trebol(8),Carta.pica(8),Carta.diamante(9),Carta.corazon(6),Carta.trebol(9),Carta.pica(4),Carta.trebol(4),Carta.trebol(6),Carta.pica(7),Carta.trebol(1),Carta.trebol(7) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8),Carta.trebol(9),Carta.trebol(10) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(1)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.pica(7)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.trebol(7))},
        {Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.corazon(2)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(4)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.trebol(7))},
        {Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(4)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.pica(7)),Move.monton(Carta.trebol(7))},
        {Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.pica(7))},
        {Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(6)),Move.monton(Carta.trebol(9)),Move.mazo(Carta.pica(4))},
        {Move.mazo(Carta.corazon(10)),Move.monton(Carta.pica(3)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.trebol(10)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(9)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(10)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.pica(6)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(4))},
        {Move.monton(Carta.diamante(5)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(4))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_10");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_10",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_10",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_10",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_10",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_10",447);

    return ok_sofar;
  }


  static boolean test_11() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.diamante(9),Carta.diamante(3),Carta.corazon(8),Carta.corazon(7),Carta.trebol(7),Carta.diamante(5),Carta.pica(5),Carta.corazon(9),Carta.trebol(2),Carta.trebol(5),Carta.pica(10),Carta.corazon(5),Carta.trebol(3),Carta.pica(9),Carta.diamante(1),Carta.pica(7),Carta.pica(8),Carta.trebol(9),Carta.diamante(4),Carta.trebol(6),Carta.diamante(2),Carta.pica(1),Carta.corazon(2),Carta.trebol(4),Carta.diamante(8),Carta.diamante(7),Carta.corazon(1),Carta.corazon(10),Carta.pica(2),Carta.trebol(10),Carta.corazon(6),Carta.pica(4),Carta.diamante(6),Carta.trebol(8),Carta.corazon(4),Carta.pica(6),Carta.corazon(3),Carta.pica(3),Carta.trebol(1),Carta.diamante(10) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8),Carta.trebol(9),Carta.trebol(10) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(9)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(6)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(7)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(3)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(10))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(1)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(10))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(1)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(6)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.pica(3))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(3))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(3))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(8)),Move.monton(Carta.trebol(9)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.pica(2)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(3))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.trebol(10)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.pica(6)),Move.monton(Carta.pica(3)),Move.mazo(Carta.diamante(10))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.corazon(6)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.pica(6))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_11");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_11",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_11",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_11",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_11",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_11",499);

    return ok_sofar;
  }


  static boolean test_12() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.pica(10),Carta.pica(6),Carta.trebol(3),Carta.diamante(3),Carta.trebol(2),Carta.pica(9),Carta.trebol(9),Carta.diamante(6),Carta.corazon(4),Carta.corazon(1),Carta.pica(1),Carta.corazon(2),Carta.trebol(4),Carta.corazon(8),Carta.diamante(7),Carta.corazon(5),Carta.corazon(3),Carta.pica(4),Carta.diamante(1),Carta.diamante(4),Carta.diamante(2),Carta.trebol(10),Carta.corazon(10),Carta.trebol(5),Carta.trebol(7),Carta.pica(7),Carta.corazon(9),Carta.corazon(7),Carta.trebol(8),Carta.pica(2),Carta.trebol(6),Carta.pica(8),Carta.diamante(10),Carta.trebol(1),Carta.pica(3),Carta.diamante(9),Carta.diamante(5),Carta.diamante(8),Carta.pica(5),Carta.corazon(6) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(1)),Move.monton(Carta.pica(1)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(4)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(6))},
        {Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.pica(2)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.pica(5))},
        {Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(3)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.pica(5))},
        {Move.mazo(Carta.pica(6)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(4)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(2)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.pica(3)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.corazon(6))},
        {Move.mazo(Carta.pica(6)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.pica(4)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.pica(5)),Move.mazo(Carta.corazon(6))},
        {Move.mazo(Carta.pica(6)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(4)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.trebol(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.diamante(8))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_12");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_12",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_12",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_12",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_12",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_12",425);

    return ok_sofar;
  }


  static boolean test_13() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.corazon(5),Carta.corazon(7),Carta.pica(6),Carta.pica(2),Carta.trebol(3),Carta.pica(5),Carta.trebol(9),Carta.trebol(5),Carta.trebol(6),Carta.diamante(10),Carta.trebol(1),Carta.diamante(4),Carta.diamante(7),Carta.corazon(10),Carta.diamante(9),Carta.pica(10),Carta.corazon(6),Carta.pica(4),Carta.pica(8),Carta.corazon(4),Carta.corazon(3),Carta.pica(7),Carta.corazon(2),Carta.corazon(8),Carta.trebol(7),Carta.trebol(4),Carta.diamante(6),Carta.pica(1),Carta.trebol(2),Carta.diamante(3),Carta.corazon(9),Carta.trebol(10),Carta.diamante(1),Carta.corazon(1),Carta.pica(3),Carta.pica(9),Carta.diamante(8),Carta.diamante(2),Carta.diamante(5),Carta.trebol(8) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3),Carta.diamante(4),Carta.diamante(5),Carta.diamante(6) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3),Carta.trebol(4),Carta.trebol(5),Carta.trebol(6),Carta.trebol(7),Carta.trebol(8) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.pica(1)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(8))},
        {Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(2)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.trebol(4)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.diamante(5))},
        {Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.trebol(5)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(7)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.trebol(8))},
        {Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.trebol(6)),Move.mazo(Carta.diamante(10)),Move.monton(Carta.diamante(4)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.trebol(7)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.trebol(8))},
        {Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.diamante(5))},
        {Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.diamante(6)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(8))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_13");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_13",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_13",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_13",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_13",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_13",403);

    return ok_sofar;
  }


  static boolean test_14() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.diamante(2),Carta.pica(7),Carta.trebol(9),Carta.diamante(8),Carta.corazon(8),Carta.trebol(8),Carta.trebol(10),Carta.diamante(5),Carta.pica(1),Carta.corazon(1),Carta.trebol(5),Carta.corazon(2),Carta.corazon(5),Carta.diamante(7),Carta.trebol(4),Carta.diamante(9),Carta.corazon(6),Carta.pica(5),Carta.pica(9),Carta.corazon(10),Carta.trebol(2),Carta.pica(2),Carta.pica(4),Carta.trebol(3),Carta.corazon(3),Carta.diamante(1),Carta.pica(3),Carta.corazon(4),Carta.corazon(9),Carta.pica(8),Carta.diamante(10),Carta.diamante(4),Carta.trebol(1),Carta.pica(10),Carta.diamante(3),Carta.trebol(6),Carta.corazon(7),Carta.pica(6),Carta.trebol(7),Carta.diamante(6) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3),Carta.corazon(4),Carta.corazon(5),Carta.corazon(6),Carta.corazon(7) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.pica(1)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(6))},
        {Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(5)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(2)),Move.monton(Carta.pica(2)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(6))},
        {Move.monton(Carta.diamante(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.trebol(3)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.pica(3)),Move.monton(Carta.corazon(4)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(10)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(6))},
        {Move.mazo(Carta.trebol(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.corazon(5)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(6)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(10)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.pica(4)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.trebol(6)),Move.monton(Carta.corazon(7)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(6))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_14");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_14",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_14",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_14",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_14",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_14",319);

    return ok_sofar;
  }


  static boolean test_15() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.pica(4),Carta.corazon(1),Carta.diamante(4),Carta.trebol(2),Carta.diamante(3),Carta.pica(9),Carta.trebol(9),Carta.corazon(8),Carta.trebol(10),Carta.diamante(5),Carta.trebol(7),Carta.diamante(2),Carta.trebol(3),Carta.corazon(4),Carta.trebol(1),Carta.diamante(10),Carta.trebol(8),Carta.pica(2),Carta.pica(5),Carta.pica(6),Carta.pica(10),Carta.pica(1),Carta.diamante(6),Carta.corazon(3),Carta.trebol(6),Carta.trebol(4),Carta.diamante(1),Carta.diamante(7),Carta.trebol(5),Carta.corazon(10),Carta.corazon(7),Carta.diamante(8),Carta.corazon(9),Carta.pica(3),Carta.pica(8),Carta.corazon(6),Carta.diamante(9),Carta.corazon(2),Carta.pica(7),Carta.corazon(5) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5),Carta.pica(6) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2),Carta.trebol(3) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.corazon(1)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.corazon(4)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(4)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.corazon(5))},
        {Move.mazo(Carta.corazon(1)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.corazon(5))},
        {Move.mazo(Carta.corazon(1)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.pica(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.pica(3)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(7))},
        {Move.monton(Carta.pica(4)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.pica(5)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(7))},
        {Move.monton(Carta.corazon(1)),Move.mazo(Carta.diamante(4)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(9)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.pica(7))},
        {Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.trebol(3)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.trebol(8)),Move.monton(Carta.pica(6)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(7))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_15");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_15",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_15",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_15",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_15",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_15",465);

    return ok_sofar;
  }


  static boolean test_16() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.diamante(5),Carta.trebol(1),Carta.corazon(1),Carta.trebol(8),Carta.trebol(10),Carta.diamante(10),Carta.diamante(7),Carta.diamante(9),Carta.corazon(4),Carta.trebol(3),Carta.pica(9),Carta.pica(1),Carta.pica(4),Carta.diamante(1),Carta.trebol(7),Carta.corazon(9),Carta.trebol(4),Carta.corazon(10),Carta.diamante(6),Carta.corazon(8),Carta.diamante(2),Carta.pica(5),Carta.trebol(5),Carta.corazon(6),Carta.pica(7),Carta.pica(3),Carta.trebol(6),Carta.trebol(9),Carta.diamante(4),Carta.diamante(8),Carta.diamante(3),Carta.pica(6),Carta.corazon(2),Carta.trebol(2),Carta.corazon(7),Carta.pica(8),Carta.corazon(3),Carta.pica(2),Carta.pica(10),Carta.corazon(5) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3),Carta.pica(4),Carta.pica(5) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2),Carta.corazon(3) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2),Carta.diamante(3) };
    Carta[] finalTrebolesArr = new Carta[] {  };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.trebol(1)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.pica(1)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(6)),Move.monton(Carta.corazon(2)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(8)),Move.monton(Carta.corazon(3)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.corazon(5))},
        {Move.mazo(Carta.trebol(1)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(9)),Move.monton(Carta.pica(1)),Move.mazo(Carta.pica(4)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(8)),Move.monton(Carta.pica(2)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.trebol(1)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(7)),Move.monton(Carta.pica(3)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.corazon(5))},
        {Move.mazo(Carta.trebol(1)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(9)),Move.monton(Carta.pica(4)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.diamante(2)),Move.monton(Carta.pica(5)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.trebol(1)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.corazon(8)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.diamante(8)),Move.monton(Carta.diamante(3)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.pica(10))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_16");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_16",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_16",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_16",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_16",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_16",397);

    return ok_sofar;
  }


  static boolean test_17() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.pica(9),Carta.trebol(6),Carta.pica(7),Carta.pica(8),Carta.pica(1),Carta.trebol(1),Carta.diamante(4),Carta.diamante(10),Carta.corazon(10),Carta.corazon(4),Carta.trebol(5),Carta.diamante(3),Carta.diamante(2),Carta.corazon(7),Carta.trebol(2),Carta.diamante(6),Carta.trebol(8),Carta.corazon(3),Carta.corazon(6),Carta.diamante(1),Carta.corazon(1),Carta.pica(5),Carta.pica(2),Carta.corazon(9),Carta.pica(10),Carta.corazon(8),Carta.corazon(5),Carta.diamante(7),Carta.pica(4),Carta.pica(6),Carta.trebol(3),Carta.diamante(8),Carta.trebol(7),Carta.pica(3),Carta.diamante(9),Carta.trebol(10),Carta.trebol(9),Carta.diamante(5),Carta.trebol(4),Carta.corazon(2) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2),Carta.pica(3) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1),Carta.corazon(2) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.trebol(6)),Move.mazo(Carta.pica(8)),Move.monton(Carta.pica(1)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(7)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(1)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.pica(5)),Move.monton(Carta.pica(2)),Move.mazo(Carta.corazon(9)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(8)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(2))},
        {Move.mazo(Carta.trebol(6)),Move.mazo(Carta.pica(8)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(6)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.pica(3)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(9)),Move.mazo(Carta.trebol(4)),Move.monton(Carta.corazon(2))},
        {Move.mazo(Carta.trebol(6)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.diamante(3)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.corazon(7)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.diamante(6)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(5))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_17");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_17",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_17",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_17",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_17",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_17",273);

    return ok_sofar;
  }


  static boolean test_18() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.corazon(7),Carta.pica(3),Carta.diamante(8),Carta.corazon(4),Carta.pica(5),Carta.pica(8),Carta.trebol(2),Carta.trebol(8),Carta.pica(7),Carta.corazon(8),Carta.corazon(5),Carta.diamante(10),Carta.diamante(6),Carta.diamante(4),Carta.pica(4),Carta.corazon(3),Carta.pica(2),Carta.trebol(10),Carta.trebol(9),Carta.diamante(2),Carta.pica(9),Carta.trebol(6),Carta.corazon(6),Carta.diamante(9),Carta.corazon(2),Carta.trebol(5),Carta.pica(1),Carta.diamante(3),Carta.pica(6),Carta.corazon(1),Carta.trebol(4),Carta.diamante(1),Carta.pica(10),Carta.diamante(5),Carta.diamante(7),Carta.trebol(3),Carta.trebol(7),Carta.corazon(10),Carta.corazon(9),Carta.trebol(1) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1),Carta.diamante(2) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1),Carta.trebol(2) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(5)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(1))},
        {Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(3)),Move.monton(Carta.pica(2)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(5)),Move.mazo(Carta.pica(6)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.trebol(4)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.corazon(9)),Move.monton(Carta.trebol(1))},
        {Move.mazo(Carta.pica(3)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.pica(8)),Move.monton(Carta.trebol(2)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.diamante(2)),Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(3)),Move.mazo(Carta.corazon(10))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_18");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_18",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_18",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_18",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_18",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_18",287);

    return ok_sofar;
  }


  static boolean test_19() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.trebol(5),Carta.pica(9),Carta.diamante(6),Carta.corazon(3),Carta.trebol(9),Carta.diamante(5),Carta.pica(5),Carta.trebol(2),Carta.pica(6),Carta.pica(7),Carta.trebol(4),Carta.diamante(10),Carta.trebol(8),Carta.diamante(4),Carta.corazon(7),Carta.pica(4),Carta.corazon(6),Carta.corazon(2),Carta.corazon(9),Carta.diamante(3),Carta.diamante(8),Carta.corazon(5),Carta.corazon(1),Carta.corazon(10),Carta.trebol(3),Carta.diamante(1),Carta.trebol(10),Carta.pica(1),Carta.trebol(1),Carta.diamante(9),Carta.trebol(6),Carta.pica(3),Carta.diamante(7),Carta.diamante(2),Carta.corazon(8),Carta.trebol(7),Carta.pica(2),Carta.pica(8),Carta.corazon(4),Carta.pica(10) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1),Carta.pica(2) };
    Carta[] finalCorazonesArr = new Carta[] { Carta.corazon(1) };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(5)),Move.monton(Carta.corazon(1)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.pica(1)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(7)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10))},
        {Move.mazo(Carta.pica(9)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.trebol(3)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.trebol(10)),Move.monton(Carta.pica(1)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.diamante(2)),Move.mazo(Carta.trebol(7)),Move.monton(Carta.pica(2)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(10))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_19");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_19",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_19",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_19",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_19",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_19",221);

    return ok_sofar;
  }


  static boolean test_20() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.trebol(3),Carta.diamante(9),Carta.trebol(7),Carta.trebol(4),Carta.diamante(8),Carta.trebol(6),Carta.diamante(5),Carta.corazon(1),Carta.pica(10),Carta.diamante(7),Carta.pica(9),Carta.trebol(2),Carta.corazon(7),Carta.pica(2),Carta.corazon(3),Carta.pica(7),Carta.trebol(5),Carta.pica(8),Carta.corazon(9),Carta.pica(5),Carta.pica(1),Carta.corazon(8),Carta.trebol(9),Carta.trebol(1),Carta.pica(3),Carta.diamante(3),Carta.pica(4),Carta.diamante(4),Carta.trebol(8),Carta.corazon(4),Carta.corazon(10),Carta.corazon(6),Carta.trebol(10),Carta.diamante(10),Carta.pica(6),Carta.corazon(5),Carta.diamante(6),Carta.diamante(1),Carta.diamante(2),Carta.corazon(2) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1) };
    Carta[] finalCorazonesArr = new Carta[] {  };
    Carta[] finalDiamantesArr = new Carta[] { Carta.diamante(1) };
    Carta[] finalTrebolesArr = new Carta[] { Carta.trebol(1) };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(5)),Move.monton(Carta.pica(1)),Move.mazo(Carta.corazon(8)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.diamante(3)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.corazon(4)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.diamante(10)),Move.mazo(Carta.corazon(5)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.corazon(2))},
        {Move.mazo(Carta.diamante(9)),Move.mazo(Carta.trebol(4)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.diamante(7)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(2)),Move.mazo(Carta.pica(7)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.trebol(9)),Move.monton(Carta.trebol(1)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.pica(4)),Move.mazo(Carta.trebol(8)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.pica(6)),Move.mazo(Carta.diamante(6)),Move.monton(Carta.diamante(1)),Move.mazo(Carta.diamante(2))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_20");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_20",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_20",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_20",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_20",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_20",229);

    return ok_sofar;
  }


  static boolean test_21() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.diamante(7),Carta.pica(7),Carta.trebol(7),Carta.pica(10),Carta.corazon(8),Carta.diamante(9),Carta.corazon(5),Carta.corazon(10),Carta.corazon(9),Carta.pica(3),Carta.diamante(10),Carta.trebol(1),Carta.trebol(9),Carta.diamante(5),Carta.trebol(5),Carta.corazon(3),Carta.pica(4),Carta.corazon(1),Carta.trebol(3),Carta.diamante(1),Carta.diamante(8),Carta.corazon(2),Carta.pica(9),Carta.trebol(10),Carta.pica(6),Carta.trebol(2),Carta.diamante(6),Carta.pica(5),Carta.trebol(8),Carta.corazon(6),Carta.corazon(4),Carta.pica(2),Carta.pica(1),Carta.trebol(6),Carta.corazon(7),Carta.diamante(4),Carta.trebol(4),Carta.pica(8),Carta.diamante(3),Carta.diamante(2) };

    Carta[] finalPicasArr = new Carta[] { Carta.pica(1) };
    Carta[] finalCorazonesArr = new Carta[] {  };
    Carta[] finalDiamantesArr = new Carta[] {  };
    Carta[] finalTrebolesArr = new Carta[] {  };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
        {Move.mazo(Carta.pica(7)),Move.mazo(Carta.pica(10)),Move.mazo(Carta.diamante(9)),Move.mazo(Carta.corazon(10)),Move.mazo(Carta.pica(3)),Move.mazo(Carta.trebol(1)),Move.mazo(Carta.diamante(5)),Move.mazo(Carta.corazon(3)),Move.mazo(Carta.corazon(1)),Move.mazo(Carta.diamante(1)),Move.mazo(Carta.corazon(2)),Move.mazo(Carta.trebol(10)),Move.mazo(Carta.trebol(2)),Move.mazo(Carta.pica(5)),Move.mazo(Carta.corazon(6)),Move.mazo(Carta.pica(2)),Move.monton(Carta.pica(1)),Move.mazo(Carta.trebol(6)),Move.mazo(Carta.diamante(4)),Move.mazo(Carta.pica(8)),Move.mazo(Carta.diamante(2))}
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_21");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_21",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_21",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_21",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_21",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_21",157);

    return ok_sofar;
  }


  static boolean test_22() {
    boolean ok_sofar=true;

    Carta[] initMazeArr = new Carta[] { Carta.trebol(2),Carta.trebol(5),Carta.pica(9),Carta.diamante(4),Carta.pica(5),Carta.trebol(6),Carta.pica(6),Carta.diamante(1),Carta.pica(10),Carta.pica(7),Carta.corazon(3),Carta.corazon(7),Carta.corazon(5),Carta.diamante(7),Carta.diamante(5),Carta.corazon(2),Carta.diamante(9),Carta.trebol(9),Carta.trebol(3),Carta.trebol(4),Carta.trebol(8),Carta.corazon(1),Carta.diamante(2),Carta.diamante(10),Carta.trebol(10),Carta.corazon(10),Carta.corazon(6),Carta.pica(4),Carta.corazon(8),Carta.trebol(7),Carta.diamante(8),Carta.pica(1),Carta.corazon(9),Carta.pica(2),Carta.corazon(4),Carta.pica(3),Carta.pica(8),Carta.diamante(3),Carta.diamante(6),Carta.trebol(1) };

    Carta[] finalPicasArr = new Carta[] {  };
    Carta[] finalCorazonesArr = new Carta[] {  };
    Carta[] finalDiamantesArr = new Carta[] {  };
    Carta[] finalTrebolesArr = new Carta[] {  };

    FIFO<Carta> initMazo = new OurFIFOImplementation<Carta>(initMazeArr);
    FIFO<Carta> initMazoCopy = new OurFIFOImplementation<Carta>(initMazeArr);
    LIFO<Carta> picas = new LIFOArray<Carta>();
    LIFO<Carta> corazones = new LIFOArray<Carta>();
    LIFO<Carta> diamantes = new LIFOArray<Carta>();
    LIFO<Carta> treboles = new LIFOArray<Carta>();
    LIFO<Carta>[] montones = new LIFO [] {picas,corazones,diamantes,treboles};

    LIFO<Carta> finalPicas = new LIFOArray<Carta>(finalPicasArr);
    LIFO<Carta> finalCorazones = new LIFOArray<Carta>(finalCorazonesArr);
    LIFO<Carta> finalDiamantes = new LIFOArray<Carta>(finalDiamantesArr);
    LIFO<Carta> finalTreboles = new LIFOArray<Carta>(finalTrebolesArr);

    Move[][] history = { 
      };

    OurFIFOImplementation.resetNumOperations();

    try {
      Solitario solitario = new Solitario();
      solitario.play(initMazo,montones);
    } catch (Throwable exc) {
      printError("test_22");
      System.out.print("calling play with the mazo ");
      System.out.println(initMazoCopy);
      System.out.println(" raised an exception "+exc+" although it should not have");
      exc.printStackTrace();
      return false;
    }

    if (ok_sofar) ok_sofar = checkPalo("test_22",initMazoCopy,picas,"picas",finalPicas,history);
    if (ok_sofar) ok_sofar = checkPalo("test_22",initMazoCopy,corazones,"corazones",finalCorazones,history);
    if (ok_sofar) ok_sofar = checkPalo("test_22",initMazoCopy,diamantes,"diamantes",finalDiamantes,history);
    if (ok_sofar) ok_sofar = checkPalo("test_22",initMazoCopy,treboles,"treboles",finalTreboles,history);
    if (ok_sofar) checkCount("test_22",80);

    return ok_sofar;
  }


  static public String reportGame(Move[][] game) {
      StringBuffer sb = new StringBuffer();
      
      for (int round=0; round<game.length; round++) {
	  sb.append("Round "+round+": ");
	  Move[] moves = game[round];
	  for (int i=0; i<moves.length; i++) {
	      String moveString = moves[i].toString();
	      if (moveString != "")
		  sb.append(moveString+", ");
	  }
	  sb.append("\n");
      }
      return sb.toString();
  }

  static boolean checkPalo(String TestName,
			   FIFO<Carta> initialMazo,
			   LIFO<Carta> palo,
			   String paloString,
			   LIFO<Carta> expectedPalo,
			   Move[][] history) {
      if (!expectedPalo.equals(palo)) {
	  printError(TestName);
	  printExperiment(initialMazo,history);
	  System.out.println
	      ("*** Error: after playing palo "+paloString+
	       " is supposed to be "+expectedPalo+
	       "\nbut is "+palo);
	      return false;
      }
      return true;
  }

  static void checkCount(String TestName,
			 int count) {
      int numOperations = OurFIFOImplementation.getNumOperations();
      // Permit some variation
      if (numOperations < count-40 || numOperations>count+40) {
	  printWarning(TestName);
	  System.out.println
	      ("The number of enqueue and dequeue operations on the "+
	       "mazos should be approximately "+count+" "+
	       "but is "+numOperations);
      }
  }

  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n*** Error in "+TestName+":");
  }

  static void printExperiment(FIFO<Carta> initialMazo,
			       Move[][] history) {
      System.out.println
	  ("Initial mazo:\n"+initialMazo+"\n\nCorrect moves:\n"+reportGame(history));
  }
}

class Move {
    Carta carta;
    int palo;
    boolean isEnqueueOnMazo;
    
    // Move to Mazo
    Move(Carta carta) {
	this.carta = carta;
	this.isEnqueueOnMazo = true;
    }

    // Move to palo
    Move(Carta carta, int palo) {
	this.carta = carta;
	this.palo = palo;
	this.isEnqueueOnMazo = false;
    }

    static Move mazo(Carta carta) {
	return new Move(carta);
    }

    static Move monton(Carta carta) {
	return new Move(carta,carta.getPalo());
    }

    public String toString() {
	if (isEnqueueOnMazo)
	    return "";
	else
	    return carta+" stored";
    }
}


