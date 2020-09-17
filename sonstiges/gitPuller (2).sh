for d in */; do 
		
	if [ -d "$d\.git" ]; then
                echo "PATH: $d"
 		cd "$d";git pull ; cd ..
        fi
done
