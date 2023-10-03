#!/bin/bash
gunicorn app:app -w 2 --thread 2 -b 0.0.0.0:5000