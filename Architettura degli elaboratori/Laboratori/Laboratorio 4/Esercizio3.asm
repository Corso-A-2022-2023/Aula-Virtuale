.globl start

.data

.text

start:
	li t0,10 #N
	li t1,1# R
	li t2,0 #A
	li t3,1#B
while: 
	ble t0,x0,endWhile
	add t1,t2,t3
	add t2,t3,zero
	add t3,t1,zero
	addi t0,t0,-1
	
	j while
endWhile:

print:

	addi a0,t1,0
	li a7,1
	ecall
exit: 
	addi x17,x0,10
	ecall

