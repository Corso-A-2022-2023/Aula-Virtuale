.globl start
.text
start:
	li t0,37#N
	li t1, 1#M
	li t2, 0#R
	li t3,64#i
do:
	and t4,t0,t1
	add t2,t2,t4
	srli t0,t0,1
	addi t3,t3,-1
	ble t3,x0,endDoWhile
	j do
endDoWhile:

print:

	addi a3,t3,0
	li a7, 1
	ecall
	
exit:
	addi x17, x0,10
	ecall
