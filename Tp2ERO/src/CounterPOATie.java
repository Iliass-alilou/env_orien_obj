
/**
* CounterPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Counter.idl
* Thursday, May 27, 2021 11:28:19 AM WEST
*/

public class CounterPOATie extends CounterPOA
{

  // Constructors

  public CounterPOATie ( CounterOperations delegate ) {
      this._impl = delegate;
  }
  public CounterPOATie ( CounterOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public CounterOperations _delegate() {
      return this._impl;
  }
  public void _delegate (CounterOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public int value ()
  {
    return _impl.value();
  } // value

  public void inc ()
  {
    _impl.inc();
  } // inc

  public void dec ()
  {
    _impl.dec();
  } // dec

  private CounterOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class CounterPOATie