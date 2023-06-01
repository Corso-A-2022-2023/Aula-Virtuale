.globl _start
.data
	n1: .word 15#a
	n2: .word 8#b
	n3: .word 16#c
	max: .word 0
.text
_start:
	la t0,n1
	lw t1,0(t0)#a
	lw t2,4(t0)#b
	lw t3,8(t0)#c
	add t4,x0,t1
	bge t4,t2,endIf
	add t4,x0,t2
endIf:	
	bge t4,t3,endIf2
	add t4,x0,t3

endIf2:
	sw t4 12(t0)
print:
	addi a0,t4,0
	li a7 ,1
	ecall
exit:
	addi x17,x0,10
	ecall