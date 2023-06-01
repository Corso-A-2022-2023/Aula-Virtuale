	.text
Main:
	li a0,3
	li a1,4
	li s1,10
	li t0,13
	jal multiply
	add t1,a0,zero

exit:	addi x17,x0,10
	ecall
	
multiply:
	addi sp,sp-8
	sd s1,0(sp)
	li s1,0
	li t0,0
while:
	beq t0,a1,endWhile
	add s1,s1,a0
	addi t0,t0,1
	j while
endWhile:
	add a0,s1,zero
	ld s1,0(sp)
	addi sp,sp,8
	jr ra
	
