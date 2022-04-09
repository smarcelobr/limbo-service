#!/bin/sh
# wait-for-mariadb.sh

set -e

dbHost="$1"
dbUser="$2"
dbPass="$3"

while ! mysqladmin ping -h $dbHost --silent --connect-timeout=10 -u $dbUser --password=$dbPass; do
    >&2 echo "MariaDB is unavailable - sleeping"
    sleep 3
done

>&2 echo "MariaDB is up - executing command"
