package edu.neu.ccs.cs5004.component.bank;

import edu.neu.ccs.cs5004.component.msgSig.MsgDigiPairI;

public interface RsaSigVerificationI {
  boolean verifyMsg(BankI bank, MsgDigiPairI pair);
}