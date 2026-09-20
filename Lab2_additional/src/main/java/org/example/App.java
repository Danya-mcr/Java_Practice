package org.example;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import org.example.Classes.BrakeClasses.ElectricBrakes;
import org.example.Classes.BrakeClasses.HydraulicBrakes;
import org.example.Classes.BrakeClasses.MechanicalBrakes;
import org.example.Classes.BrakeClasses.PneumaticBrakes;
import org.example.Classes.EngineClasses.*;
import org.example.Classes.GearClasses.AutomatedManualGear;
import org.example.Classes.GearClasses.AutomaticGear;
import org.example.Classes.GearClasses.CVTGear;
import org.example.Classes.GearClasses.ManualGear;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Paths;


public class App
{
    public static void main( String[] args )
    {
        Class<?>[] engineTypes = {DieselEngine.class, ElectricEngine.class, GasEngine.class, GasolineEngine.class, HybridEngine.class};
        Class<?>[] brakeTypes = {ElectricBrakes.class, HydraulicBrakes.class, MechanicalBrakes.class, PneumaticBrakes.class};
        Class<?>[] gearTypes = {AutomatedManualGear.class, AutomaticGear.class, CVTGear.class, ManualGear.class};

        for (Class<?> engine : engineTypes){
            for (Class<?> brake : brakeTypes) {
                for (Class<?> gear : gearTypes) {
                    String name = engine.getSimpleName().replace("Engine", "") + brake.getSimpleName().replace("Brakes", "") + gear.getSimpleName().replace("Gear", "") + "Car";

                    MethodSpec engMet = MethodSpec.methodBuilder("engineType")
                            .addModifiers(Modifier.PUBLIC)
                            .returns(void.class)
                            .addStatement("$T.out.println($S)", System.class, "%s".formatted(engine.getSimpleName()))
                            .build();

                    MethodSpec brkMet = MethodSpec.methodBuilder("brakeType")
                            .addModifiers(Modifier.PUBLIC)
                            .returns(void.class)
                            .addStatement("$T.out.println($S)", System.class, "%s".formatted(brake.getSimpleName()))
                            .build();

                    MethodSpec grMet = MethodSpec.methodBuilder("gearType")
                            .addModifiers(Modifier.PUBLIC)
                            .returns(void.class)
                            .addStatement("$T.out.println($S)", System.class, "%s".formatted(gear.getSimpleName()))
                            .build();

                    TypeSpec clss = TypeSpec.classBuilder(name)
                            .addModifiers(Modifier.PUBLIC)
                            .addMethod(engMet)
                            .addMethod(brkMet)
                            .addMethod(grMet)
                            .build();
                    try {
                        JavaFile.builder("org.example.Cars", clss).build().writeTo(Paths.get("src/main/java"));
                    } catch (IOException exception) {};
                }
            }
        }
    }
}
