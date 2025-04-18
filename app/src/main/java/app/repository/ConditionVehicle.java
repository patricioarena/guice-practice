package app.repository;

import java.util.List;
import java.util.function.Supplier;

import app.model.vo.State;

/**
 * New: Unused, in perfect mechanical and aesthetic condition. It has no wear and does not require reconditioning.
 * Clean: Some normal wear, but no major mechanical or cosmetic problems. May require limited reconditioning.
 * Rough: Several mechanical and/or cosmetic problems requiring significant repairs.
 * Damaged: Major mechanical and/or body damage that may render it in non-safe running condition.
 *-- Traducción
 * Nuevo: Sin uso previo, en perfectas condiciones mecánicas y estéticas. No tiene desgaste y no requiere reacondicionamiento
 * Limpia: Alguna desgaste normal, pero sin problemas mecánicos o cosméticos importantes. Puede requerir una reacondicionamiento limitado.
 * En mal estado: Varios problemas mecánicos y/o cosméticos que requieren reparaciones significativas.
 * Dañada: Daño mecánico y/o en la carrocería importante que puede hacer que no esté en condiciones seguras para funcionar.
 */
@FunctionalInterface
public interface ConditionVehicle extends Supplier<List<State>> {

}