.globl start
.text
start:
	li t0, 10#A
	li t1 ,5#B
	li t2,0#R
	li t3,0#i
	li t4,0#j
forI:bge t3,t0,endForI#{//primo for # when (i>=a) jump
forJ:bge t4,t1,endForJ#{//second for
	add t5,t3,t4
	add t2,t2,t2
	add t2,t2,t5
	addi t4,t4,1
	j forJ
endForJ:
	addi,t3,t3,1
	j forI
endForI:#}
print: 
	addi a0,t2,0
	li a7,1
	ecall
exit:
	addi x17,x0,10
	ecall
