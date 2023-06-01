.globl start


.text
start:
	li a0,24#a
	li a1 ,30#b
	jal MCD#passa al metodo
print: 
	li a7,1
	ecall
exit:
	addi x17,x0,10
	ecall
	
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