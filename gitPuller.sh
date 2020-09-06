#!/bin/sh
if [[ "$OSTYPE" == "linux-gnu"* ]]; then
echo "ENTERING LINUX STATEMENT"
for d in */; do 	
	if [ -d "$d.git" ]; then
                echo "PULLING EXISTING GIT PATH:: $d"
 		cd "$d";git pull ; cd ..
    fi
    done
    
else
	echo "ENTERING OTHER OS STATEMENT"
	for d in */; do 
		
		if [ -d "$d\.git" ]; then
        	        echo "PULLING EXISTING GIT PATH:: $d"
 			cd "$d";git pull ; cd ..
    	fi
    done
fi


