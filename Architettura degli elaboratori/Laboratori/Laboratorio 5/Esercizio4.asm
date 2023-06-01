.globl start
.data
	arr:.word 12, 2, 1, 3, 5, 1, 7, 1, -1, 4, -2, -3, 1, 9, -6, 10
	size: .word 16
	sum: .word 0
.text
start:
	la t5,arr
	la t4,size
	lw t0,0(t4)#i
	li t2,0
for:
	lw t1,0(t5)
	add t2,t2,t1#somma
	addi t5,t5,4
	addi t0,t0,-1#i--
	bne t0,zero,for#t0>=0
save:
	la t1,sum
	sw t2,0(t1)
print:
	addi a0,t2,0
	li a7,1
	ecall
exit:
	addi x17,x0,10
	ecall