.globl _start
.data
	array: .word  -12, 2, 1, 3, 5, 1, 7, 1, -1, 4, -2, -3, 1, 9, -6, -10
	size: .word 16
	max: .word 0
.text
_start:
	la t5 array
	la t4,size
	lw t0,0(t4)#posizione attuale
	lw t2,0(t5)#Primo elemento
for:	
	lw t1,0(t5)#secondo elemento
	bge t2,t1,if
	add t2,t1,zero
if:
	addi t5,t5,4
	addi t0,t0,-1
	bne t0,zero,for 
	la t1,max
	sw t2,0(t1)
print: 
	addi a0,t2,0
	li a7,1
	ecall
exit:
	addi x17,x0,10