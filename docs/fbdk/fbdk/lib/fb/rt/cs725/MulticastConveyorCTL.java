/* Copyright (c)2022 Rockwell Automation. All rights reserved. */
package fb.rt.cs725;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK MulticastConveyorCTL
  * @author JHC
  * @version 20221021/JHC
  */
public class MulticastConveyorCTL extends FBInstance
{
/** Input event qualifier */
  public BOOL PE = new BOOL();
/** VAR Block */
  public BOOL Block = new BOOL();
/** VAR Candidate */
  public BOOL Candidate = new BOOL();
/** VAR MyPID */
  public INT MyPID = new INT();
/** VAR MyTstamp */
  public INT MyTstamp = new INT();
/** VAR MyLoadDelay */
  public INT MyLoadDelay = new INT();
/** VAR PID_in */
  public INT PID_in = new INT();
/** VAR Tstamp_in */
  public INT Tstamp_in = new INT();
/** VAR MAIN_PE */
  public BOOL MAIN_PE = new BOOL();
/** Output event qualifier */
  public BOOL MotoRotate = new BOOL();
/** VAR BlockCon */
  public BOOL BlockCon = new BOOL();
/** VAR PID_out */
  public INT PID_out = new INT();
/** VAR Tstamp_out */
  public INT Tstamp_out = new INT();
/** VAR lastPE */
  public BOOL lastPE = new BOOL();
/** VAR lastBlock */
  public BOOL lastBlock = new BOOL();
/** VAR MeFirst */
  public BOOL MeFirst = new BOOL();
/** VAR YouFirst */
  public BOOL YouFirst = new BOOL();
/** VAR LampClock */
  public INT LampClock = new INT();
/** VAR DelayCounter */
  public INT DelayCounter = new INT();
/** VAR DelayElapse */
  public BOOL DelayElapse = new BOOL();
/** Initialization Request */
 public EventServer INIT = new EventInput(this);
/** Normal Execution Request */
 public EventServer REQ = new EventInput(this);
/** EVENT CAS_STOP */
 public EventServer CAS_STOP = new EventInput(this);
/** EVENT CAS_START */
 public EventServer CAS_START = new EventInput(this);
/** EVENT LISTEN */
 public EventServer LISTEN = new EventInput(this);
/** Initialization Confirm */
 public EventOutput INITO = new EventOutput();
/** Execution Confirmation */
 public EventOutput CNF = new EventOutput();
/** EVENT STOP */
 public EventOutput STOP = new EventOutput();
/** EVENT START */
 public EventOutput START = new EventOutput();
/** EVENT REPLY */
 public EventOutput REPLY = new EventOutput();
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventServer eiNamed(String s){
    if("INIT".equals(s)) return INIT;
    if("REQ".equals(s)) return REQ;
    if("CAS_STOP".equals(s)) return CAS_STOP;
    if("CAS_START".equals(s)) return CAS_START;
    if("LISTEN".equals(s)) return LISTEN;
    return super.eiNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
*/
  public EventOutput eoNamed(String s){
    if("INITO".equals(s)) return INITO;
    if("CNF".equals(s)) return CNF;
    if("STOP".equals(s)) return STOP;
    if("START".equals(s)) return START;
    if("REPLY".equals(s)) return REPLY;
    return super.eoNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ivNamed(String s) throws FBRManagementException{
    if("PE".equals(s)) return PE;
    if("Block".equals(s)) return Block;
    if("Candidate".equals(s)) return Candidate;
    if("MyPID".equals(s)) return MyPID;
    if("MyTstamp".equals(s)) return MyTstamp;
    if("MyLoadDelay".equals(s)) return MyLoadDelay;
    if("PID_in".equals(s)) return PID_in;
    if("Tstamp_in".equals(s)) return Tstamp_in;
    if("MAIN_PE".equals(s)) return MAIN_PE;
    return super.ivNamed(s);}
/** {@inheritDoc}
* @param s {@inheritDoc}
* @return {@inheritDoc}
* @throws FBRManagementException {@inheritDoc}
*/
  public ANY ovNamed(String s) throws FBRManagementException{
    if("MotoRotate".equals(s)) return MotoRotate;
    if("BlockCon".equals(s)) return BlockCon;
    if("PID_out".equals(s)) return PID_out;
    if("Tstamp_out".equals(s)) return Tstamp_out;
    return super.ovNamed(s);}
/** {@inheritDoc}
* @param ivName {@inheritDoc}
* @param newIV {@inheritDoc}
* @throws FBRManagementException {@inheritDoc} */
  public void connectIV(String ivName, ANY newIV)
    throws FBRManagementException{
    if("PE".equals(ivName)) connect_PE((BOOL)newIV);
    else if("Block".equals(ivName)) connect_Block((BOOL)newIV);
    else if("Candidate".equals(ivName)) connect_Candidate((BOOL)newIV);
    else if("MyPID".equals(ivName)) connect_MyPID((INT)newIV);
    else if("MyTstamp".equals(ivName)) connect_MyTstamp((INT)newIV);
    else if("MyLoadDelay".equals(ivName)) connect_MyLoadDelay((INT)newIV);
    else if("PID_in".equals(ivName)) connect_PID_in((INT)newIV);
    else if("Tstamp_in".equals(ivName)) connect_Tstamp_in((INT)newIV);
    else if("MAIN_PE".equals(ivName)) connect_MAIN_PE((BOOL)newIV);
    else super.connectIV(ivName, newIV);
    }
/** Connect the given variable to the input variable PE
  * @param newIV The variable to connect
 */
  public void connect_PE(BOOL newIV){
    PE = newIV;
    }
/** Connect the given variable to the input variable Block
  * @param newIV The variable to connect
 */
  public void connect_Block(BOOL newIV){
    Block = newIV;
    }
/** Connect the given variable to the input variable Candidate
  * @param newIV The variable to connect
 */
  public void connect_Candidate(BOOL newIV){
    Candidate = newIV;
    }
/** Connect the given variable to the input variable MyPID
  * @param newIV The variable to connect
 */
  public void connect_MyPID(INT newIV){
    MyPID = newIV;
    }
/** Connect the given variable to the input variable MyTstamp
  * @param newIV The variable to connect
 */
  public void connect_MyTstamp(INT newIV){
    MyTstamp = newIV;
    }
/** Connect the given variable to the input variable MyLoadDelay
  * @param newIV The variable to connect
 */
  public void connect_MyLoadDelay(INT newIV){
    MyLoadDelay = newIV;
    }
/** Connect the given variable to the input variable PID_in
  * @param newIV The variable to connect
 */
  public void connect_PID_in(INT newIV){
    PID_in = newIV;
    }
/** Connect the given variable to the input variable Tstamp_in
  * @param newIV The variable to connect
 */
  public void connect_Tstamp_in(INT newIV){
    Tstamp_in = newIV;
    }
/** Connect the given variable to the input variable MAIN_PE
  * @param newIV The variable to connect
 */
  public void connect_MAIN_PE(BOOL newIV){
    MAIN_PE = newIV;
    }
private static final int index_START = 0;
private void state_START(){
  eccState = index_START;
  alg_REQ();
  CNF.serviceEvent(this);
}
private static final int index_INIT = 1;
private void state_INIT(){
  eccState = index_INIT;
  alg_INIT();
  INITO.serviceEvent(this);
  CNF.serviceEvent(this);
state_START();
}
private static final int index_CAS_START = 2;
private void state_CAS_START(){
  eccState = index_CAS_START;
  alg_START();
  START.serviceEvent(this);
  CNF.serviceEvent(this);
state_START();
}
private static final int index_CAS_STOP = 3;
private void state_CAS_STOP(){
  eccState = index_CAS_STOP;
  alg_STOP();
  STOP.serviceEvent(this);
  CNF.serviceEvent(this);
state_START();
}
private static final int index_WANTING = 4;
private void state_WANTING(){
  eccState = index_WANTING;
  alg_STOP();
  STOP.serviceEvent(this);
  REPLY.serviceEvent(this);
  CNF.serviceEvent(this);
}
private static final int index_COMPARE = 5;
private void state_COMPARE(){
  eccState = index_COMPARE;
  alg_COMP();
    if(!MeFirst.value&YouFirst.value) state_YOUFIRST();
    else if(MeFirst.value&!YouFirst.value) state_HELD1();
}
private static final int index_HELD1 = 6;
private void state_HELD1(){
  eccState = index_HELD1;
  alg_START();
  START.serviceEvent(this);
  alg_CLOCK();
  CNF.serviceEvent(this);
  alg_DELAY();
}
private static final int index_HELD2 = 7;
private void state_HELD2(){
  eccState = index_HELD2;
  alg_START();
  START.serviceEvent(this);
  alg_CLOCK();
  CNF.serviceEvent(this);
  alg_DELAY();
}
private static final int index_YOUFIRST = 8;
private void state_YOUFIRST(){
  eccState = index_YOUFIRST;
  alg_YOUFIRST();
  REPLY.serviceEvent(this);
  CNF.serviceEvent(this);
}
private static final int index_YOUNEXT = 9;
private void state_YOUNEXT(){
  eccState = index_YOUNEXT;
  alg_YOUNEXT();
  REPLY.serviceEvent(this);
  CNF.serviceEvent(this);
state_START();
}
private static final int index_TEMP_STOP2 = 10;
private void state_TEMP_STOP2(){
  eccState = index_TEMP_STOP2;
  alg_STOP();
  STOP.serviceEvent(this);
  CNF.serviceEvent(this);
}
private static final int index_TEMP_START2 = 11;
private void state_TEMP_START2(){
  eccState = index_TEMP_START2;
  alg_START();
  START.serviceEvent(this);
  CNF.serviceEvent(this);
state_START();
}
private static final int index_TEMP_STOP1 = 12;
private void state_TEMP_STOP1(){
  eccState = index_TEMP_STOP1;
  alg_STOP();
  STOP.serviceEvent(this);
  CNF.serviceEvent(this);
}
private static final int index_TEMP_START1 = 13;
private void state_TEMP_START1(){
  eccState = index_TEMP_START1;
  alg_START();
  START.serviceEvent(this);
  CNF.serviceEvent(this);
state_YOUNEXT();
}
private static final int index_DELAY_UP1 = 14;
private void state_DELAY_UP1(){
  eccState = index_DELAY_UP1;
  alg_DELAY_UP();
state_HELD1();
}
private static final int index_DELAY_UP2 = 15;
private void state_DELAY_UP2(){
  eccState = index_DELAY_UP2;
  alg_DELAY_UP();
state_HELD2();
}
private static final int index_REQ = 16;
private void state_REQ(){
  eccState = index_REQ;
  alg_TICKCLOCK();
  CNF.serviceEvent(this);
state_START();
}
/** The default constructor. */
public MulticastConveyorCTL(){
    super();
    lastPE.initializeNoException("1");
    lastBlock.initializeNoException("0");
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
    else if (e == CAS_STOP) service_CAS_STOP();
    else if (e == CAS_START) service_CAS_START();
    else if (e == LISTEN) service_LISTEN();
  }
/** Services the INIT event. */
  public void service_INIT(){
    if ((eccState == index_START)) state_INIT();
  }
/** Services the REQ event. */
  public void service_REQ(){
    if ((eccState == index_START) && (!PE.value)) state_WANTING();
    else if ((eccState == index_HELD1) && (PE.value&DelayElapse.value)) state_TEMP_STOP1();
    else if ((eccState == index_HELD1)) state_DELAY_UP1();
    else if ((eccState == index_TEMP_STOP1) && (!MAIN_PE.value)) state_TEMP_START1();
    else if ((eccState == index_HELD2) && (PE.value&DelayElapse.value)) state_TEMP_STOP2();
    else if ((eccState == index_TEMP_STOP2) && (!MAIN_PE.value)) state_TEMP_START2();
    else if ((eccState == index_HELD2)) state_DELAY_UP2();
    else if ((eccState == index_START) && (PE.value)) state_REQ();
  }
/** Services the CAS_STOP event. */
  public void service_CAS_STOP(){
    if ((eccState == index_START)) state_CAS_STOP();
  }
/** Services the CAS_START event. */
  public void service_CAS_START(){
    if ((eccState == index_START)) state_CAS_START();
  }
/** Services the LISTEN event. */
  public void service_LISTEN(){
    if ((eccState == index_WANTING)) state_COMPARE();
    else if ((eccState == index_YOUFIRST)) state_HELD2();
    else if ((eccState == index_START)) state_YOUNEXT();
  }
  /** ALGORITHM INIT IN Java*/
public void alg_INIT(){
System.out.println("In INT State");

MotoRotate.value=true;
Block.value=false;
LampClock.value=MyTstamp.value;
MeFirst.value=false;
YouFirst.value=false;

DelayElapse.value=false;
DelayCounter.value=0;

System.out.println(this+" "+MotoRotate.value);
System.out.println(MotoRotate.value);

}
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
System.out.println("In REQ State");

MeFirst.value = false;
YouFirst.value = false;

DelayElapse.value=false;
DelayCounter.value=0;

}
  /** ALGORITHM START IN Java*/
public void alg_START(){
MotoRotate.value=true;
System.out.println(this+" Start "+MotoRotate.value);

}
  /** ALGORITHM STOP IN Java*/
public void alg_STOP(){
MotoRotate.value=false;
System.out.println(this+" Stop "+MotoRotate.value);

}
  /** ALGORITHM COMP IN Java*/
public void alg_COMP(){
System.out.println("In COMP State");
if(MyTstamp.value > Tstamp_in.value){
MeFirst.value = false;
YouFirst.value = true;
}else if (MyTstamp.value < Tstamp_in.value){
MeFirst.value = true;
YouFirst.value = false;
} else {
if(MyPID.value < PID_in.value){
MeFirst.value = false;
YouFirst.value = true;
} else {
MeFirst.value = true;
YouFirst.value = false;
}
}

}
  /** ALGORITHM YOUFIRST IN Java*/
public void alg_YOUFIRST(){
System.out.println("In YOUFIRST State");
Tstamp_out.value = LampClock.value;
PID_out.value = MyPID.value;

}
  /** ALGORITHM CLOCK IN Java*/
public void alg_CLOCK(){
System.out.println("Updating Clock");
LampClock.value = Tstamp_in.value;

}
  /** ALGORITHM YOUNEXT IN Java*/
public void alg_YOUNEXT(){
System.out.println("In YOUNEXT State");
Tstamp_out.value = LampClock.value;
PID_out.value = MyPID.value;

}
  /** ALGORITHM DELAY IN Java*/
public void alg_DELAY(){
if(DelayCounter.value>MyLoadDelay.value){
DelayElapse.value=true;
}

}
  /** ALGORITHM DELAY_UP IN Java*/
public void alg_DELAY_UP(){
DelayCounter.value++;

}
  /** ALGORITHM TICKCLOCK IN Java*/
public void alg_TICKCLOCK(){
LampClock.value++;
System.out.println(this + " Lamport Clock Ticked, Now: "+LampClock.value);
}
}
