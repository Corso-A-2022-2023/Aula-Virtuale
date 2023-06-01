.globl _start
.data
.text
_start:
	li x5,0x00000000AAAAAAAA
	li x6,0x1234567812345678
	slli x7,x5,4
	#sposta di 4 posizione a sinistra 0x0000AAAAAAAA0000
	#operazione di or tra x7(x5 spostato di 4) e x6 con risultato
	#x7 in binario->0 0 0 0 1010 1010 1010 1010 1010  1010 1010 1010 1010
	#x6 in binario->1234567	1000 0001 0010 0011 0100  0101 0110 0111  1000
	
	#x7 in or è ->		1010 1011 1011 1110 1110  1111 1110 1111 1000
	# in esadecimale ->     A    B      A    B     E     F    E   F     8
	or x7,x7,x6
	#sposto di 4 posizione a sinistra x6 di 4 posizioni
	#in binario 0001 0010 0011 0100 0101 0110 0111 1000
	#	    0001 0010 0011 0100 0101 0110 0111 1000
	# quindi lo shift è l'aggiunta di 4 0000 a sinistra il risultato
	#0010 0010 0011 0100 0101 0110 0111 1000 0001 0010 0010 0011 0100 0101 0110 0111 1000 0000
	slli x7,x6,4
	
	add x8,x0,x5
	srli x7, x5, 3
	#sposto a destra x5 in binario 1 0101 0101 0101 0101 0101 0101 0101
	andi x7, x7, 0x00000000000000FF#operazione and con risultato 0000 0000 0000 0000 0000 0000 1010 1010
exit:
	addi x17, x0, 10 # call number 10 = exit
	ecall	
