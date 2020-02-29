package lk.uot.chamath;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class application {
    public static void main(String[] args) {
       /* List<String>  student=new ArrayList<>();
        student.add("Nimal");
        student.add("Kamal");
        student.add("Sunimal");
        student.add("Ashan");
        student.add("Janith");
        student.add("Nirmal");
        System.out.println(student);

        List<String> filterdata=student.stream()
                .filter(s->s.length()>6)
                .collect(Collectors.toList());
        System.out.println(filterdata);

        */
       List<sensor> Sensors= new ArrayList<>();
        sensor sensor1 = new sensor("Living room",28);
        Sensors.add(sensor1);
        sensor sensor2 = new sensor("Office room",26);
        Sensors.add(sensor2);
        sensor sensor3 = new sensor("Bed room",29);
        Sensors.add(sensor3);
        sensor sensor4 = new sensor("Kichen room",30);
        Sensors.add(sensor4);
        sensor sensor5 = new sensor("Bath room",28);
        Sensors.add(sensor5);

        List<sensor> hotSensors=Sensors.stream()
                .filter(sensor -> sensor.getValue()>28)
                .collect(Collectors.toList());

        System.out.println(hotSensors);


    }
}
