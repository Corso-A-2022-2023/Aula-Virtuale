.globl _start
.data
	array: .byte  -12, 2, 1, 3, 5, 1, 7, 1, -1, 4, -2, -3, 1, 9, -6, -10
	size: .byte 16
	max: .byte 0
.text
_start:
	la t5 array
	la t4,size
	lb t0,0(t4)#posizione attuale
	lb t2,0(t5)#Primo elemento
for:	
	lb t1,0(t5)#secondo elemento
	bge t2,t1,if
	add t2,t1,zero
if:
	addi t5,t5,1
	addi t0,t0,-1
	bne t0,zero,for 
	la t1,max
	sb t2,0(t1)
print: 
	addi a0,t2,0
	li a7,1
	ecall
exit:
	addi x17,x0,10