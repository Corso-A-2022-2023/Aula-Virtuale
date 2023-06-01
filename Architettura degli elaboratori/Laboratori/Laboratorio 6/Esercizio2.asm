.globl start
.text
start:
	li a0,12
	li a1,9
	jal mcm
	
print:
	li a7,1
	ecall
exit:
	addi x17,x0,10
	ecall
	
mcm:
	addi sp,sp,-24
	sd ra,0(sp)#salvataggio dell'indirizzo di ritorno
	sd t0, 8(sp)#salvataggio del valore
	mul t0,a0,a1
	jal MCD	
	div a0,t0,a0
	ld ra,0(sp)
	addi sp,sp,24
	jr ra
MCD:

while:
	beq a0,a1,endWhile
	ble a0,a1 else
	sub a0,a0,a1
	j endIf
else:
	sub a1,a1,a0
endIf:
 	j while
endWhile:
	jr ra #return a