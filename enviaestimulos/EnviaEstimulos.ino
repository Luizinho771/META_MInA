int ledPin =  4; //atribui o pino 4 a variável ledPin 
int dado; //variável que receberá os dados da porta serial
int InitialDelay = 1;
int ProductionInterval = 1;
int ProductionQuantity = 10;
int DelayVariation = 1;
int StopsQuantity = 1;
int i;
int result = -1;
int stops;

void setup(){
  Serial.begin(9600);//frequência da porta serial
   pinMode(ledPin,OUTPUT); //define o pino o ledPin como saída
}

void loop(){
  i = 1;
  stops = 1;
  while(i<=ProductionQuantity){
    if(i==1){
        delay(InitialDelay*1000);
        digitalWrite(ledPin,HIGH);
        digitalWrite(ledPin,LOW);
        delay((DelayVariation + ProductionInterval)*1000);
        i = i + 1;
    }else{
       if(stops<=StopsQuantity){
           result = random(0,1);
       }
       if(result==1){
            delay(1000);
            stops = stops + 1;
            result = -1;
       }else{
          digitalWrite(ledPin,HIGH);
          digitalWrite(ledPin,LOW);
          delay((DelayVariation + ProductionInterval)*1000);
          i = i + 1;
        }
     }
  }
}
