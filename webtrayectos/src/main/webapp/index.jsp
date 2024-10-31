<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/cabecera.jsp"%>

<h1 class="pb-2">Añadir Trayecto</h1>

<form action="index" method="post" class="px-3 pb-3 needs-validation "   novalidate>
              <div class="row mb-3">
                  <label for="salida" class="col-sm-2 col-form-label required">Salida</label>
                  <div class="col-sm-10">
                    <input name="salida" type="datetime-local" minlength="3" class="form-control" id="salida" required>
                    <div class="invalid-feedback">
                      La hora de salida es obligatoria
                  </div>
                  </div>
                </div>
              <div class="row mb-3">
                  <label for="llegada" class="col-sm-2 col-form-label required">Llegada</label>
                  <div class="col-sm-10">
                    <input name="llegada" type="datetime-local" minlength="3" class="form-control" id="llegada" required>
                    <div class="invalid-feedback">
                      La hora de llegada es obligatoria
                  </div>
                  </div>
                </div>
      
              
              <fieldset class="row mb-3">
                <legend class="col-form-label col-sm-2 pt-0">Dirección</legend>
                <div class="col-sm-10">
                  <label class="visually-hidden" for="direccion">Dirección</label>
                  <select name="direccion" class="form-select" id="direccion" required>
                      <option value="Ida" >Ida</option>
                      <option value="Vuelta">Vuelta</option>
                  </select>      
                </div>
              </fieldset>
              
              <fieldset class="row mb-3">
                <legend class="col-form-label col-sm-2 pt-0">Ruta</legend>
                <div class="col-sm-10">
                  <label class="visually-hidden" for="ruta">Ruta</label>
                  <select name="ruta" class="form-select" id="ruta" required>
                      <option value="Erandiogoikoa" >Erandiogoikoa</option>
                      <option value="Astrabudua" >Astrabudua</option>
                      <option value="Deusto top">Deusto top</option>
                      <option value="Deusto mid">Deusto mid</option>
                      <option value="Deusto bot">Deusto bot</option>
                      <option value="Cuesta gigantica">Cuesta gigantica</option>
                  </select>      
                </div>
              </fieldset>

				
              <div class="form-floating mb-2 offset-sm-2">
                <textarea class="form-control" pattern="[a-zA-Z0-9]+" maxlength="200" placeholder="Observaciones" id="observaciones" style="height: 100px" name="observaciones"></textarea>
                <label for="observaciones">Observaciones</label>
              </div>

                        
              <div class="row">
                <div class="offset-sm-2"><button type="submit" class="btn btn-secondary opacity-30" value="enviar">Enviar</button></div>
              </div>
            </form>


<%@ include file="includes/pie.jsp"%>