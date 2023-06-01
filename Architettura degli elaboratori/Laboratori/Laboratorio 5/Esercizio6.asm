.globl start
.data
	array: .byte 2,4,3,3,6,7,9
	size: .byte 7
	result:.byte 0
.text
start:
	la t5,array
	la t4,size
	lb t0,0(t4)#dimensione dell'array
	li t2,0
	li t3,2#divisione in 2 per i pari
for:
	lb t1,0(t5)
	#elemento corrente dell'array per ogni iterazione del ciclo
	rem  t1,t1,t3# operazione del modulo con elemento e t3(2)
	beq t1,zero,if#if(t1!=0)
	addi t2,t2,1
if:
	addi t5,t5,1#vai all'elemento successivo dell'array
	addi t0,t0,-1#i++
	bne t0,zero,for
	la t1,result
	sb t1,0(t1)
print: 
	addi a0,t2,0
	li a7,1
	ecall
exit: 
	addi x17,x0,10
	ecall