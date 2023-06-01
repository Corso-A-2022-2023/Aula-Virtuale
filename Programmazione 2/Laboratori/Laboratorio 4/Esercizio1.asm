.globl _start
.data
.text
_start:
	#Frammento 1
	li t0,-3#x
	li t1,2#y
	sub t0,t0,t1
	bge t0,zero,endIf1#if!(x<0)operazione al contrario{
	li t0,0
		
endIf1:#}
	addi t1,t1,1
	
exit:
	addi x17,x0,10
	ecall
