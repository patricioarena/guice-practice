#!/usr/bin/env bash

set -e  # Detener el script en caso de error
set -u  # Tratar variables no inicializadas como errores

CURRENT_BRANCH=$(git rev-parse --abbrev-ref HEAD)

if [[ "$CURRENT_BRANCH" == hotfix/* ]]; then
    exit 0  # Salir con éxito si es una rama hotfix
fi


# Función para verificar si hay cambios en archivos .java
are_java_files_changed() {
  # evalúa si ALL_FILES tiene en su lista de nombre de archivos alguno con extensión .java
    echo "$@" | grep -Fq  ".java" |grep '.java$'> /dev/null
}


detect_javax_usage() {
     grep -l  "javax.inject" $*
}

if are_java_files_changed $* ; then

  VIOLATIONS=$(detect_javax_usage $*)
  # Si se detectan archivos que contienen violaciones a la regla los reporta y sale por error
  if [[ -n "$VIOLATIONS" ]]; then
    echo "Se detectaron violaciones a la regla de uso de javax en los siguientes archivos: $VIOLATIONS

Se reemplazan los imports de javax.inject por jakarta.inject"

    # edita con sed cada archivo que contiene javax.inject y reemplaza por jakarta.inject
    for f  in $VIOLATIONS ; do
      # condiciona a que sea un archivo .java con un match con el operador =~ y el valor de javax.inject. Sólo los archivos de jaba
      echo - $f
      sed -i ''  's/javax.inject/jakarta.inject/g' $f
     done
  fi
fi
