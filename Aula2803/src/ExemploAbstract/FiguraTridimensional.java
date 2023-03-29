package ExemploAbstract;

public abstract class FiguraTridimensional {
        protected float volume;

        public abstract void calcularVolume();

        public float getVolume(){
            return volume;
        }
    }

