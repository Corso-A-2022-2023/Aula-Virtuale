.globl start
.data
.text
start:
	#Frammento 2
	li t0,0
	li t1,1
	addi t0,t0,-2
	add t0,t0,t1
	blt t0,t1, if 
	#if(x<y)se è vera allora entra nell'etichetta delle if{
	addi t1,t1,1#else
	j endIf
	#istruzione di salto per dire che deve passare l'etichetta endIf
if:
	#contenuto if
	addi t0,t0,1
endIf:#fine if}
	#salta codice torna 
exit:
	addi x17,x0,10
	ecall
