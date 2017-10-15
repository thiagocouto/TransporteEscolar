import {Component, Input} from "@angular/core"

@Component({
    selector: 'component-passageiro-formEndereco',
    templateUrl: 'passageiro-formEndereco.component.html',
})

export class PassageiroFormEnderecoComponent{   

    _passageiro: any;

    @Input()
    set passageiro(passageiro){
        this._passageiro = passageiro;
    }

    get passageiro(){
        return this._passageiro;
    }
}