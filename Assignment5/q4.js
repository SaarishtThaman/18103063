var patt = "";
//n*n loop with appropriate spaces and symbols
for(i=1;i<=10;i++){
  patt = "";
  for(j=i;j<10;j++){
    patt += " ";
  }
  for(k=0;k<(i*2)-1;k++){
    if(i==0) patt += "*";
	else patt += "0";
  }
  console.log(patt);
}