#!/usr/bin/env bash
if [ ! -f ~/.config/git/hooks/pre-push ]; then
  echo "[ERROR] Pre-push hook is not configured. Read CONTRIBUTING.md to learn how to configure it."
  exit 1
fi

exit 0 # Salir con éxito
