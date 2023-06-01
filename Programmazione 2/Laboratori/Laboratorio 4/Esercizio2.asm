.globl start
.data
.text
start:
	li t0,1#a
	li t1,11#b
	li t2,2#c
	add t3,x0,t0 #max
	bge t3,t1,if1#(a<b){
	#contenuto dell if
	add t3,x0,t1
if1:#}
	bge t3,t2,if2#if(a<c){
	add t3,x0,t2
if2:#}

print:
	addi a0 t3,0
	li a7,1
	ecall
exit:
	addi x17,x0,10
	ecall
