.globl start
.data
	v1: .word 8
	v2: .word 9
	v3: .word 0#salvare il valore(c = a+b)
.text
start:
	#li t0,0x10010000#registro dove sono salvati i valori v1,v2,v3
	#ma questa operazione è sbagliata da eseguire
	#la macchina sa già a quale indirizzo sta dichiarando sia l'8 che il 9
	#load address
	la t0,v1
	lw t1,0(t0)
	#ricorda che una parola è composta da 4 bit e va di 4n e commincia da 0 
	#invece una doppia parola è composta da 8 bit
	#se mettessi 1 la macchina da errore
	lw t2,4(t0)
	add t3,t1,t2
	sw t3,8(t0)


exit:
	addi x17,x0,10
	ecall