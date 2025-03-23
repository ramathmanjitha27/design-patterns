package org.design_patterns.adapter;

public class TypeCAdapter implements USB{

    private TypeC typeC;

    public TypeCAdapter(TypeC typeC){
        this.typeC = typeC;
    }

    @Override
    public void connectWithUsbCable(){
        typeC.connectWithTypeCCable();
    }

}
