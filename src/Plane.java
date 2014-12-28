
public class Plane {
	
	char [][] firstClass = new char[5][4];
	char [][] econClass = new char[30][6];
	int numberOfSeats=0;
	String seatClass="";
	String seatLocation="";
	int runNumber=0;
	
	public Plane(){	
		for(int i=0; i<5;i++){
				firstClass[i][0]='a';
				firstClass[i][1]='b';
				firstClass[i][2]='c';
				firstClass[i][3]='d';
			}
		
		for(int j=0; j<30;j++){
				econClass[j][0]='a';
				econClass[j][1]='b';
				econClass[j][2]='c';
				econClass[j][3]='d';
				econClass[j][4]='e';
				econClass[j][5]='f';
			}
	
	}
	
	
	public void PlaneShow(){
		System.out.println("***NOTE: Taken seats are marked with an X***");
		System.out.println("******************");
		System.out.println("First Class");
		System.out.println("******************");
		for (int x = 0; x<5; x++) {
            for (int y = 0; y<4; y++) {
                System.out.print(firstClass[x][y]);
                if(y==1){
                	System.out.print(" ");
                }
            }
            System.out.println();
		
		}
				System.out.println("******************");
		System.out.println("Economy Class");
		System.out.println("******************");

		for (int w = 0; w<30; w++) {
            for (int z = 0; z<6; z++) {
                System.out.print(econClass[w][z]);
                if(z==2){
                	System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
	
	
	public void PlaneCheck(int numSeats, String claName, String seatLocal){
		
		runNumber=0;
		
		if(claName.equalsIgnoreCase("first")&&(seatLocal.equalsIgnoreCase("aisle"))){
		for (int i=0;i<5;i++){
			for (int j=0;j<4;j++){
			if(firstClass[i][j]=='b'||firstClass[i][j]=='c'){
				runNumber++;
			}
			}
		}
		if(runNumber>=numSeats){
			this.PlaneAdd(numSeats, claName, seatLocal);
				}
		else{
			System.out.println("***There are not enough seats left with your selection, sorry.***");
			return;
				}	
		}
		
		if(claName.equalsIgnoreCase("first")&&(seatLocal.equalsIgnoreCase("window"))){
			for (int i=0;i<5;i++){
				for (int j=0;j<4;j++){
				if(firstClass[i][j]=='a'||firstClass[i][j]=='d'){
					runNumber++;
				}
				}
			}
			if(runNumber>=numSeats){
				this.PlaneAdd(numSeats, claName, seatLocal);
					}
			else{
				System.out.println("***There are not enough seats left with your selection, sorry.***");
				return;
					}	
			}
		
		
		
		
		if(claName.equalsIgnoreCase("economy")&&seatLocal.equalsIgnoreCase("window")){
		for (int i=0;i<30;i++){
			for (int j=0;j<6;j++){
			if(firstClass[i][j]=='a'||econClass[i][j]=='f'){
				runNumber++;
			}
			}
		}
		if(runNumber>=numSeats){
			this.PlaneAdd(numSeats, claName, seatLocal);
			}
		else {
			System.out.println("***There are not enough seats left with your selection, sorry.***");
			return;
			}
		}
		
		if(claName.equalsIgnoreCase("economy")&&seatLocal.equalsIgnoreCase("center")){
			for (int i=0;i<30;i++){
				for (int j=0;j<6;j++){
				if(firstClass[i][j]=='b'||econClass[i][j]=='e'){
					runNumber++;
				}
				}
			}
			if(runNumber>=numSeats){
				this.PlaneAdd(numSeats, claName, seatLocal);
				}
			else {
				System.out.println("***There are not enough seats left with your selection, sorry.***");
				return;
				}
			}
		
		if(claName.equalsIgnoreCase("economy")&&seatLocal.equalsIgnoreCase("aisle")){
			for (int i=0;i<30;i++){
				for (int j=0;j<6;j++){
				if(firstClass[i][j]=='c'||econClass[i][j]=='d'){
					runNumber++;
				}
				}
			}
			if(runNumber>=numSeats){
				this.PlaneAdd(numSeats, claName, seatLocal);
				}
			else {
				System.out.println("***There are not enough seats left with your selection, sorry.***");
				return;
				}
			}
		
		
	}
	
	
	
	public void PlaneAdd(int numSeats, String claName, String seatLocal){
		
		if (claName.equalsIgnoreCase("first")){
			
			if(seatLocal.equalsIgnoreCase("window")){
				for (int i=0;i<5;i++){
					for (int j=0;j<4;j++){
					if(firstClass[i][j]=='a'||firstClass[i][j]=='d'){
						firstClass[i][j]='X';
						if(numSeats==2){
							for (int q=0;q<5;q++){
								for (int w=0;w<4;w++){
								if(firstClass[q][w]=='a'||firstClass[q][w]=='d'){
									firstClass[q][w]='X';
									return;
									}
								}
							}
						}
						else{
							return;
							}		
						}	
					}
				}
			}
			if(seatLocal.equalsIgnoreCase("aisle")){
				for (int i=0;i<5;i++){
					for (int j=0;j<4;j++){
					if(firstClass[i][j]=='b'||firstClass[i][j]=='c'){
						firstClass[i][j]='X';
						if(numSeats==2){
							for (int q=0;q<5;q++){
								for (int w=0;w<4;w++){
								if(firstClass[q][w]=='b'||firstClass[q][w]=='c'){
									firstClass[q][w]='X';
									return;
									}
								}
							}
						}
						else{
							return;
							}		
						}	
					}
				}
			}
		}
		else if (claName.equalsIgnoreCase("economy")){
			
			if(seatLocal.equalsIgnoreCase("aisle")){
				for (int i=0;i<30;i++){
					for (int j=0;j<6;j++){
					if(econClass[i][j]=='c'||econClass[i][j]=='d'){
						econClass[i][j]='X';
						if(numSeats>2){
							for (int q=0;q<30;q++){
								for (int w=0;w<6;w++){
								if(econClass[q][w]=='c'||econClass[q][w]=='d'){
									econClass[q][w]='X';
									if(numSeats==3){
										for (int b=0;b<30;b++){
											for (int c=0;c<6;c++){
											if(econClass[b][c]=='c'||econClass[b][c]=='d'){
												econClass[b][c]='X';
												return;
												}
											}
										}
									}
									else{
										return;
									}
									}
								}
							}
						}
						else{
							return;
							}		
						}	
					}
				}
			}
			else if(seatLocal.equalsIgnoreCase("window")){
				for (int i=0;i<30;i++){
					for (int j=0;j<6;j++){
					if(econClass[i][j]=='a'||econClass[i][j]=='f'){
						econClass[i][j]='X';
						if(numSeats>2){
							for (int q=0;q<30;q++){
								for (int w=0;w<6;w++){
								if(econClass[q][w]=='a'||econClass[q][w]=='f'){
									econClass[q][w]='X';
									if(numSeats==3){
										for (int b=0;b<30;b++){
											for (int c=0;c<6;c++){
											if(econClass[b][c]=='a'||econClass[b][c]=='f'){
												econClass[b][c]='X';
												return;
												}
											
											}
										}
									}
									else{
										return;
									}
									}
								
								}
							}
						}
						else{
							return;
							}		
						}	
						
					}
				}
			}
			
			else if(seatLocal.equalsIgnoreCase("center")){
				for (int i=0;i<30;i++){
					for (int j=0;j<6;j++){
					if(econClass[i][j]=='b'||econClass[i][j]=='e'){
						econClass[i][j]='X';
						if(numSeats>2){
							for (int q=0;q<30;q++){
								for (int w=0;w<6;w++){
								if(econClass[q][w]=='b'||econClass[q][w]=='e'){
									econClass[q][w]='X';
									if(numSeats==3){
										for (int b=0;b<30;b++){
											for (int c=0;c<6;c++){
											if(econClass[b][c]=='b'||econClass[b][c]=='e'){
												econClass[b][c]='X';
												return;
												}
											
											}
										}
									}
									else{
										return;
									}
									}
								
								}
							}
						}
						else{
							return;
							}		
						}	
						
					}
				}
			}
	}
		
}
}	
